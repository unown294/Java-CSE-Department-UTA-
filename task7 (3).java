import java.util.Scanner;

public class task7
{  
  // This function gets a double number from the user.
  // It ensures that the user enters a valid double number.  
  public static double user_double(String message)
  {
    Scanner in = new Scanner(System.in);
    double result;
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
        return Double.parseDouble(s);
    }
    catch (Exception e)
    {
        System.out.printf("%s is not a valid double.\n\n", s);
    }
   }
  
  }

public static double pick_middle(double first,double second,double third){
    double middle = 0;
if ((first >= second)||(first >= third)){
    if(first <= third){
        middle = first;
        return middle;
    }
    else if((third <= first)&&(second <= third)){
        middle = third;
        }
    else{
        middle = second;
    }
}
if(second >= first){
    if(second <= third){
        middle = second;
    }
    else if((second >= third)&&(third >= first)){
        middle = third;
    }
    else{
        middle = first;
    }
}
return middle;
}

  
public static void main(String[] args)
  {
    while (true)
    {
      double first = user_double("please enter the first number, or q to quit: ");
      double second = user_double("please enter the second number, or q to quit: ");
      double third = user_double("please enter the third number, or q to quit: ");
      double middle = pick_middle(first, second, third);
      System.out.printf("the middle value is %.1f\n\n", middle);
    }
  }
}