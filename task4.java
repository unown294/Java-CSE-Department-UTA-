import java.util.Scanner;

public class task4
{

  public static int count_bs(String word)
  {
    int counter = 0;
    for (int i = 0; i < word.length(); i++)
    {
      if ((word.charAt(i) == 'b') || (word.charAt(i) == 'B'))
      {
        counter++;
      }
    }
    return counter;
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter a word: ");
    String str = in.next();

    int result = count_bs(str);
    System.out.printf("%s contains letter B %d times.\n", str, result);
  }
}