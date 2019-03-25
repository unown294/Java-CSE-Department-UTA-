import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class task2
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
    
  public static String[][] read_spreadsheet(String args){
     ArrayList<String> lines = read_file("nba.txt");
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
  
  public static void save_player_info(String[][] data, String player){
      PrintWriter out = null;
      try{
          out = new PrintWriter("out4.txt");
      }
      catch(Exception e){
          System.out.printf("Failed to open file");
          System.exit(0);
      }
      for(int i = 0; i < data.length; i++){
        String testplayer = data[i][0].toLowerCase();
        if(testplayer.indexOf(player.toLowerCase())!= -1){
            for(int u = 0; u < data[0].length; u++){
                out.printf("%20s: %s\r\n",data[0][u],data[i][u]);
            }
        }
     }      
   }
   public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String[][] data = read_spreadsheet("nba.txt");
    System.out.printf("\nEnter part of a player's name: ");
    String player = in.next();
    save_player_info(data, player);
    System.out.printf("Exiting...\n");
  }

}
  