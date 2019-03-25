import java.util.Arrays;
import java.util.Scanner;

public class task10
{
  
    public static String sort_letters(String text){
        char[] array = text.replaceAll("0123456789,./;'-=_+", "").toLowerCase().toCharArray();
        Arrays.sort(array);
        String sortedWord = new String(array);
        
        return sortedWord;
    }
    
    public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some text, or q to quit: ");
      String text = in.nextLine();
      if (text.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      String result = sort_letters(text);
      System.out.printf("Result: %s.\n\n", result);
    }
  }
}