public class problem1
{
  public static void print_large(int[] array)
  {
      for(int i = 0;i < array.length;i++){
          if(array[i]>= 50){
              System.out.printf("%d\n", array[i]);
          }
      }
  }
  

  public static void main(String[] args)
  {
    int[] array1 = {105, 10, 5, 82, 15, 60};
    print_large(array1);
  }
}