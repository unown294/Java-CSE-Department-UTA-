import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class CountAlbums
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
   
   
   return true;
 }
   
  public static void processFile(String input_name){
      String[][] data = read_spreadsheet(input_name);
      if(data == null){
          System.out.printf("Exiting...\n");
          System.exit(0);
      }
      //retrive names
      ArrayList<String> names = new ArrayList<String>();
      names.add("");
      for(int i = 0; i < data.length;i++){
          if(i == 0){
              names.add(data[i][0]);
          }
          for(int u = 0; u < 1;u++){
            if(data[i][0].equals(names.get(u))){
            }
            else{
                String value = data[i][0];
                names.add(value);
            }
      }
      }     
      //HashSet to remove the names cause every other method isnt working
      ArrayList<String> Names = new ArrayList<>();
      //HashSet that is compairing and limiting what is being added to the list
      HashSet<String> set = new HashSet<>();
      for(String item : names){
          if(!set.contains(item)){
              Names.add(item);
              set.add(item);
          }
      }
      //create a name array
      String[] name = new String[Names.size()];
      for(int ii = 0;ii < Names.size();ii++){
          name[ii] = Names.get(ii);
      }
      
      
      //Retrieve numbers of albums
      //This array is the same size as name[ii]
      int[] total_albums = new int[Names.size()];
      int counter = 0;
      for(int p = 0; p < total_albums.length;p++){
        for(int x = 0;x < names.size();x++){
            if(name[p].equals(names.get(x))){
                counter++;
            }
        }
            total_albums[p] = counter;
            counter = 0;
            //System.out.printf("%d\n",total_albums[p]);
        }
      //sorts the albums accordingly
      Arrays.sort(total_albums);
      //correcting the order of the array total_albums
      counter = 0;
      int[] Total_albums = new int[total_albums.length];
      for(int j = total_albums.length-1;j>=0;j--){
          
          Total_albums[counter] = total_albums[j];
          counter++;
      }
      //find the highest value
      int a = Total_albums[0];
      int b = Total_albums[1];
      for(int g = 0; g < Total_albums.length;g++){
          if(a > b){
              b = a;
          }
      }
      //System.out.printf("Highest amount of albums are %d", b);
      //Sort the names in the correct order
      String[] name_sorted = new String[name.length];
      int[] comparer = new int[name.length];
      for(int p = 0; p < total_albums.length;p++){
        for(int x = 0;x < names.size();x++){
            if(name[p].equals(names.get(x))){
                counter++;
            }
        }
            comparer[p] = counter;
            counter = 0;
      }      
      for(int c = 1;c < name.length;c++){
        for(int cc = 0; cc < Total_albums.length;cc++)
        if(comparer[c] == Total_albums[cc]){
            name_sorted[c] = name[c];
            //System.out.printf("%s\n",name[c]);
        }
      }
      counter = 0;
      
      //System.out.printf("\n\n");
      for(int t = 1; t < Total_albums.length;t++){
          System.out.printf("%s : %s\n",name_sorted[t],Total_albums[t]);
      }
  
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
     result[i] = line.split(" -");     
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
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.printf("Please enter the name of the input file: ");
    String input_name = in.next();
    
    processFile(input_name);
    System.out.printf("\n\nExiting...\n");
  }
}