import java.util.Scanner;

public class task6 {
    
    public static int user_integer(String message)
  {
    Scanner in = new Scanner(System.in);
    int result;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      try{
          if(Integer.parseInt(s) >= 1){
          int testyear = Integer.parseInt(s);
          return testyear;
      }
      else{
          System.out.printf("%s is not >= 1.\n\n", s);
      }
      }
      catch (Exception e){
          System.out.printf("%s is not a valid integer.\n\n", s);
      }
    }
}
    
public static boolean is_leap_year(int testyear){
    boolean year = false; 
    if (testyear % 4 == 0){
         year = true;
    }
     
    return year;
    }
    
    public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    while (true)
    {
      int year = user_integer("Please enter a year >= 1, or q to quit: ");
      boolean result = is_leap_year(year);
      if (result == true)
      {
        System.out.printf("Yes, %d is a leap year.\n\n", year);
      } 
      else
      {
        System.out.printf("No, %d is not a leap year.\n\n", year);
      }
    }
  }
}
