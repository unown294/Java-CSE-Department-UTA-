import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class compute_grades
{
     public static boolean sanity_check(String[][] data)
 {
   if (data == null)
   {
     System.out.printf("Sanity check: null data\n");
     return false;
   }
      
   // make sure the file is not empty.
   if (data.length < 2)
   {
     System.out.printf("Sanity check: %d rows\n", data.length);
     return false;
   }
   
   // all rows must have the same number of columns
   int cols = data[0].length;
   for (int row = 0; row < data.length; row++)
   {
     int current_cols = data[row].length;
     if (current_cols != cols)
     {
       System.out.printf("Sanity check: %d columns at row %d\n", current_cols, row);
       return false;
     }
   }
   
/*   // make sure that all columns except for column 0 contain numbers.
   for (int row = 1; row < data.length; row++)
   {
     for (int col = 1; col < data[0].length; col++)
     {
       // make sure that data[row][col] is a number
       String value = data[row][col];
       try
       {
         double number = Double.parseDouble(value);
       }
       catch (Exception e)
       {
         System.out.printf("Non-number found: %s. row = %d, col = %d\n", 
                           value, row, col);
         return false;
       }
     }
   }
 /*/  
   return true;
 }
    
    public static void process_grades(String input_name, String csv_name, 
                                    String pretty_name)
  {
      String[][] lines= read_spreadsheet(input_name);
      boolean result = sanity_check(lines);
      if(result == false){
          System.out.printf("Exiting...\n");
          System.exit(0);
      }
      int columns = lines[0].length;
      int rows = lines.length;
      double hw = 0;
      int names = 2;
      String name = "";
      int examnumber = 5;
      double examtotal = 0;
      double hw_average = 0;
      double[] hw_score = new double[rows];
      String[] name2 = new String[rows];
      double[] exam_score = new double[rows];
      double[] min_score = new double[rows];
      String[] grade = new String[rows];
      int counter = 0;
      // For taking homework averages
      for(int i = 1; i < rows;i++){
          for(int u = 5; u < columns; u++){
              hw =hw + Double.parseDouble(lines[i][u]);
              counter++;
          }   
        hw_average = hw / (counter);
        hw_score[i] = hw_average;
        //System.out.printf("%f,%f\n", hw_average, hw);
        hw = 0;
        counter = 0;
      }
      //Creating a name array
      for(int i = 1; i < rows; i++){
          for(int u = 0; u < names; u++){
              name += lines[i][u];
              if(u==0){
                  name = name + " ";
              }
          }
          name2[i] = name;
          name = "";
      }
      //Averaging the Exam scores
      for(int i = 1; i < rows;i++){
          for(int u = 2; u < examnumber;u++){
              examtotal += Double.parseDouble(lines[i][u]);
              counter++;
          }
          exam_score[i] = examtotal/counter;
          examtotal = 0;
          counter = 0;
        }
      //Combining the scores before being compared for calculating the minum score
      double t1 = 0;
      double t2 = 0;
      double tm = 0;
      for(int i = 1; i < rows;i++){
        if (exam_score[i] > hw_score[i]){
            tm = hw_score[i];
        }
        else{
            tm = exam_score[i];
        }
      //System.out.printf("%f\n",tm);
      min_score[i] = tm;
      }
      //Finding the grades
      for(int i = 0; i < rows; i++){
          if((min_score[i] >= 90)&&(min_score[i] <= 100)){
              grade[i] = "A";
          }
          if((min_score[i] < 90)&&(min_score[i] >= 80)){
              grade[i] = "B";
          }
          if((min_score[i] < 80)&&(min_score[i] >= 70)){
              grade[i] = "C";
          }
          if((min_score[i] < 70)&&(min_score[i] >= 60)){
              grade[i] = "D";
          }
          if((min_score[i] < 60)){
              grade[i] = "F";
          }
      }
      //Fill in missing info left out by the text
      String[] titles = {"names","exam score","hw score","min score","grade"};
      
      //For printing the various output files that are asked of
      PrintWriter out = null;
      try{
          out = new PrintWriter(csv_name);
      }
      catch(Exception e){
          System.out.printf("failed to open %s\n", csv_name);
      }
      out.printf("%s,%s,%s,%s,%s\r\n",titles[0],titles[1],titles[2],titles[3],titles[4]);
      for(int u = 1;u < rows;u++){
      
           
          out.printf("%s,%f,%f,%f,%s\r\n",name2[u],exam_score[u],hw_score[u],min_score[u],grade[u]);
      }
      PrintWriter pretty = null;
      try {
          pretty = new PrintWriter(pretty_name);
      } catch (Exception e) {
          System.out.printf("failed to open %s\n", csv_name);
      }
      pretty.printf("%20s: %10s, %8s, %9s, %s\r\n",titles[0],titles[1],titles[2],titles[3],titles[4]);
      for(int u = 1;u < lines.length;u++){
           
          pretty.printf("%20s: %10.2f, %8.2f, %9.2f, %s\r\n",name2[u],exam_score[u],hw_score[u],min_score[u],grade[u]);
      }
      out.close();
      pretty.close();
      }
   


  public static String[][] read_spreadsheet(String filename)
  {
    ArrayList<String> lines = read_file(filename);
    if (lines == null)
    {
      return null;
    }

    int rows = lines.size();
    String[][] result = new String[rows][];

    for (int i = 0; i < rows; i++)
    {
      String line = lines.get(i);
      String[] values = line.split(",");
      result[i] = values;
    }

    return result;
  } 
  
  
  public static ArrayList<String> read_file(String filename)
  {
    File temp = new File(filename);
    Scanner input_file;
    ArrayList<String> result = new ArrayList<String>();

    try
    {
      input_file = new Scanner(temp);
    }
    catch (Exception e)
    {
      System.out.printf("Failed to open file %s\n",
                        filename);
      return result;
    }

    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    
    input_file.close();
    return result;
  }

  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.printf("Please enter the name of the input file: ");
    String input_name = in.next();
    System.out.printf("Please enter the name of the output CSV file: ");
    String csv_name = in.next();
    System.out.printf("Please enter the name of the output pretty-print file: ");
    String pretty_name = in.next();
    
    process_grades(input_name, csv_name, pretty_name);
    System.out.printf("\n\nExiting...\n");
  }
}