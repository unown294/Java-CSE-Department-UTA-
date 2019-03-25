public class task5
{
  
  public static void print_double_array(String name, double[] a)
  {
    System.out.printf("%20s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.length; i++)
    {
      System.out.printf("%7.2f", a[i]);
    }
    System.out.printf("\n");
  }
  
 public static double[] array_square(double[] a){
     double [] c = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
     double p = 2;
     for(int i = 0; i < a.length; i++){
          c[i] = Math.pow(a[i], p);
     }
     double [] results = c;
   
     return results;
     
 }
        
  public static void main(String[] args)
  {
    double[] a = {3.2, 2.1, 5.3, 8.0, 4.9, 5.7};
    double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
      
    double[] result = array_square(a);
    print_double_array("a", a);
    print_double_array("array_square(a)", result);

    result = array_square(b);
    System.out.printf("\n");
    print_double_array("b", b);
    print_double_array("array_square(b)", result);
  }
}