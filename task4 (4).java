import java.util.*;
import java.io.File;

public class task4
{
      public static ArrayList<String> read_file(String filename)
  {
    File temp = new File(filename);
    Scanner input_file;
    try
    {
      input_file = new Scanner(temp);
    }
    catch (Exception e)
    {
      System.out.printf("Failed to open file %s\n",
                        filename);
      return null;
    }

    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    
    input_file.close();
    return result;
  } 
    
  public static String[][] read_spreadsheet(String filename){
     ArrayList<String> lines = read_file(filename);
   if (lines == null)
   {
     return null;
   }
   

   // The row below creates an array of length "rows", that stores
   // objects of type String[]. Those objects are initialized to null.
   String[][] result = new String[lines.size()][];
   
   for (int i = 0; i < lines.size(); i++)
   {
     String line = lines.get(i);
     result[i] = line.split(",");     
   }
   
   return result;
 
  }

  public static double column_sum(String filename, int column){
      double sum = 0;
      String[][] columns = read_spreadsheet(filename);
      if((column < 0)||(column > columns[0].length)){
          sum = 0;
      }
      else if(column == 0){
          sum = 0;
      }
      else{
          for(int i = 1; i < columns.length;i++){
              String t = (columns[i][column]);
              if((t.toLowerCase().indexOf("abcdefghijklmnopqrstuvwxyz")==-1)){
              double x = Double.parseDouble(columns[i][column]);
              sum = sum + x;
          }
              //double x = Double.parseDouble(columns[i][column]);
              //sum = sum + x;
          }
      }
      return sum;  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    while (true)
    {
      System.out.printf("Enter a filename (or q to quit): ");
      String filename = in.next();
      if (filename.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      System.out.printf("Enter a column: ");
      int column = in.nextInt();
      
      double sum = column_sum(filename, column);
      System.out.printf("In file %s, column %d has sum %.2f\n\n",
                        filename, column, sum);
    }
  }
}