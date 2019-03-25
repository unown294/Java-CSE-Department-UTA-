
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class problem24 {

    public static void max_length_position(String filename){
      String[][] data = read_spreadsheet(filename);
      if(data == null){
          System.out.printf("Exiting...\n");
          System.exit(0);
      }
      int columns = data[0].length;
      int rows = data.length;
      String a = data[0][0];
      String b = data[0][1];
      
      for(int g = 0; g < rows;g++){
          if(a.length() > b.length()){
              b = a;
          }
      }
      System.out.printf("%s",b);
    }
    
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
    
    public static String[][] read_spreadsheet(String filename)
 {
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
 
 public static ArrayList<ArrayList<String>> read_spreadsheet2(String filename)
 {
   ArrayList<String> lines = read_file(filename);
   if (lines == null)
   {
     return null;
   }
   ArrayList<ArrayList<String>> result = new ArrayList();
   
   for (int i = 0; i < lines.size(); i++)
   {
     String line = lines.get(i);
     String[] values = line.split(",");
     
     ArrayList<String> list = new ArrayList();
     for (int j = 0; j < values.length; j++)
     {
       list.add(values[j]);
     }
     result.add(list);
   }
   
   return result;
 }
    
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

    System.out.printf("Please enter the name of the input file: ");
    String filename = in.next();
    
    max_length_position(filename);
    System.out.printf("\n\nExiting...\n");       
    }
    
}
