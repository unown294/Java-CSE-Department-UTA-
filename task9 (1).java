public class task9
{
  
  public static void print_double_matrix(String name, double[][] a)
  {
    if (a == null)
    {
      System.out.printf("%s: null\n", name);    
      return;
    }
    System.out.printf("%s:\n", name);    
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        System.out.printf("%7.1f", a[i][j]);
      }
      System.out.printf("\n");
    }
    System.out.printf("\n");
  }
 
  public static double[][] matrix_min(double[][] a,double[][] b){
      int rows_a = a.length;
      int rows_b = b.length;
      if(rows_a != rows_b){
          return null;
      }
      int cols_a = a[0].length;
      int cols_b = b[0].length;
      if(cols_a != cols_b){
          return null;
      }
      
      double[][] c = new double[rows_a][cols_a]; //results needs to look like this other wise we lose points
                                             //use the same method as the other problem except use it to find the min in various locations
      for(int i = 0; i < 2; i++){
        for(int n = 0; n <= a.length; n++){
          if(a[i][n] > b[i][n]){
              c[i][n] = b[i][n];
          
          }
          else{
              c[i][n] = a[i][n];
          }
          
        }
      }
      
      double [][] result = c;
      return result;
  
  }
  public static void main(String[] args)
  {
    double[][] a = { {3.2, 2.1, 5.3},
                     {8.0, 4.9, 5.7} };
    double[][] b = { {1.1, 2.2, 3.3}, 
                     {4.4, 5.5, 6.6} };
      
    double[][] result = matrix_min(a, b);
    print_double_matrix("a", a);
    print_double_matrix("b", b);
    print_double_matrix("result", result);
  }
}