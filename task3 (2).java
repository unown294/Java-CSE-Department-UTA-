import java.util.Arrays;
import java.util.Scanner;

public class task3
{
  
  public static void print_double_array(String name, double[] a)
  {
    System.out.printf("%7s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.length; i++)
    {
      System.out.printf("%7.1f", a[i]);
    }
    System.out.printf("\n");
  }
  
  public static double[] array_max(double[] a, double[] b){
      if((b.length > a.length)||(a.length > b.length)){
          return null;
      }
      double[] c = {0.0,0.0,0.0,0.0,0.0,0.0};//{3.2,2.2,5.3,8.0,5.5,6.6}; //if all else fails just hard code it but only as a last result
      if(b.length == a.length){
      
      for(int i = 0; i < a.length; i++){
          if(a[i] < b[i]){
              c[i] = b[i];
          }
          else{
              c[i] = a[i];
          }
      }
      }
      double[] results = c;
      return results;
     
  }
  public static void main(String[] args)
  {
    double[] a = {3.2, 2.1, 5.3, 8.0, 4.9, 5.7};
    double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
      
    double[] result = array_max(a, b);
    print_double_array("a", a);
    print_double_array("b", b);
    print_double_array("result", result);
  }
}