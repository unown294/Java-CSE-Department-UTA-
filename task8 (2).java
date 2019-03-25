import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

public class task8
{
  // returns a phonebook:
  // either reads it from the phonebook.txt file, if the file exists, 
  // or returns an empty array.
  public static String[][] read_phonebook()
  {
    String filename = "phonebook.txt";
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

    ArrayList<String> book = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      book.add(line);
      int x = book.length;
    
    }
    int y = book[0].length;
    input_file.close();
    return result;
  } 
    
  
  
  
  public static void save_phonebook(String[][] data, String new_name, String new_number)
  {
      
  } 
    

  public static void print_spreadsheet(String[][] data)
  {
    
    for (int i = 1; i < data.length; i++)
    {
      String date = columns[0];
      int line_month = get_month(date);
      System.out.printf("%d:%20s = %d\n", i, line_month);
    }
  }
  
  
  public static void search_data(String[][] data)
  {
  }
  
  
  public static String[][] input_new_entry(String[][] data)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("\nEnter a name: ");
    String name = in.nextLine();
    System.out.printf("\nEnter a number: ");
    String number = in.nextLine();
    save_phonebook(data, name, number);
    data = read_phonebook();
    return data;
  }  
  
  
  public static String[][] process_option(String[][] data, String option)
  {
    if (option.equals("1"))
    {
      print_spreadsheet(data);
    }
    else if (option.equals("2"))
    {
      data = input_new_entry(data);
    }
    else if (option.equals("3"))
    {
      search_data(data);
    }
    else if (option.equals("q"))
    {
      System.exit(0);
    }
    else
    {
      System.out.printf("Unrecognized option %s.\n", option);
    }
    
    return data;
  }
  
  public static String ask_option()
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("\n1: Print phonebook.\n");
    System.out.printf("2: Input a new entry.\n");
    System.out.printf("3: Search by name.\n");
    System.out.printf("q: Quit program.\n");
    System.out.printf("Please enter an option: ");
    String option = in.next();
    return option;
  }

  
  public static void main(String[] args)
  {
    String[][] data = read_phonebook();
    print_spreadsheet(data);

    while(true)
    {
      String option = ask_option();
      data = process_option(data, option);
    }
  }
  
}