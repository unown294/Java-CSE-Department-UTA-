import java.util.Scanner;

public class task8
{
    public static boolean starts_with_vowel(String word){
    char c = word.charAt(0);
    boolean result = false;
    if ("aeiouAEIOU".indexOf(c)!= -1){
        result = true;
    }
    return result;
    }
    
    
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some word, or q to quit: ");
      String word = in.next();
      if (word.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      boolean result = starts_with_vowel(word);
      if (result == true)
      {
        System.out.printf("Yes, %s starts with a vowel.\n\n", word);
      } 
      else
      {
        System.out.printf("No, %s does not start with a vowel.\n\n", word);
      }
    }
  }
}