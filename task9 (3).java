import java.util.Scanner;

public class task9
{
  public static char most_frequent_character(String text)
  {
    int max_counter = 0;
    char max_char = 'a'; // the initial value of max_char makes no difference.
    
    for (int i = 0; i < text.length(); i++)
    {
      char current = text.charAt(i);
      int counter = count_occurrences(text, current);
      if (counter > max_counter){
          max_counter = counter;
          max_char = current;
        }

    }
    return max_char;
  }
  
  public static int count_occurrences(String text,char current){
      int counter = 0;
      for (int i = 0; i < text.length(); i++){
          if (text.charAt(i) == current){
              counter++;
          }
      }
      
      return counter;
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
        break;
      }
      if (text.length() == 0)
      {
        break;
      }
      
      char c = most_frequent_character(text);
      int number = count_occurrences(text, c);
      System.out.printf("Most frequent character: '%c'\n", c);
      System.out.printf("Number of occurrences of '%c': %d\n\n", c, number);
    }
    System.out.printf("Exiting...\n");
  }
}