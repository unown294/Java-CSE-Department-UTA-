import java.io.File;
import java.util.*;

public class problem5
{
  public static void print_array_list(ArrayList<Integer> list){
      for(int i = 0; i < list.size();i++){
          System.out.printf("%d\n",list.get(i));
      }
  }
  
 public static ArrayList<Integer> read_numbers(String filename){
      ArrayList<String> lines = read_file(filename);
    if (lines == null)
    {
      return null;
    }

    int rows = lines.size();
    ArrayList<Integer> array = new ArrayList<Integer>();

    for (int i = 0; i < rows; i++)
    {
      int value = Integer.parseInt(lines.get(i));      
      array.add(value);
    }

    return array;
  }
  
public static ArrayList<Integer> keep_large(ArrayList<Integer> array, int threshold){
    ArrayList<Integer> list = new ArrayList();
      for(int i = 0;i < array.size();i++){
          if(array.get(i) >= threshold){
              int v = array.get(i);
              list.add(v);
          }
      }
      return list;
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

    ArrayList<String> result = new ArrayList();
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
    String name1 = "numbers1.txt";
    ArrayList<Integer> numbers = read_numbers(name1);
    ArrayList<Integer> list2 = keep_large(numbers, 50);
    print_array_list(list2);
  }
}