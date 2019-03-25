import java.util.*;
import java.io.*;

public class task7
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
    
    public static String column_name(String filename, int column){
      String[][] columns = read_spreadsheet(filename);
      String results = columns[0][column];
      
      return results;
  }
    
  public static double monthly_average(String filename,int column,int month){
      String[][] columns = read_spreadsheet(filename);
      double results = 0;
      String date = "";
      int counter = 0;
      if(month > 12 || month < 1){ //cant use because certain text files require multiple different ranges of dates
          results = -1;
      }
      else if((column <= 0)||(column > columns[0].length)){
          results= -1;
      }
      else{
          for(int i = 0; i < columns.length;i++)
            date = columns[0][i];
            double x = Double.parseDouble(columns[counter][i]);
            try{
              
              results = results + x;
              }
              catch(Exception e){
                  
              }
      }
      return results;
      
  }
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
      String name = column_name(filename, column);
      
      System.out.printf("Enter a month: ");{
      int month = in.nextInt();
      
      double average = monthly_average(filename, column, month);
      if (average == -1.00)
      {
        System.out.printf("In file %s, there is no data for %s for month %d.\n\n",
                          filename, name, month);
      }
      else
      {
        System.out.printf("In file %s, the average %s for month %d is %.2f.\n\n",
                          filename, name, month, average);
      }
    }
  }
}
}