import java.util.Scanner;

public class task5
{
  // This function gets a double number from the user.
  // It ensures that the user enters a valid double number 
  // that is >= 0.  
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
      result = 0;
      if(Double.parseDouble(s) < 0){
          System.out.printf("%s is not positive", s);
      }
      else if(Double.parseDouble(s) > 0){
          result = Double.parseDouble(s);
      }
      else{
          System.out.printf("%s is not a valid double", s);
      }
      return result;
    }
    
  }

public static double sphere_volume(double result){
double r = result;
double volume = (4/3) * Math.PI * Math.pow(r, 3);
return volume;
}

  public static void main(String[] args)
  {
    while(true)
    {
      double r = user_double("Please enter a radius >= 0, or q to quit: ");
      
      double volume = sphere_volume(r);
      System.out.printf("Volume = %.2f.\n\n", volume);
    }
  }
}
