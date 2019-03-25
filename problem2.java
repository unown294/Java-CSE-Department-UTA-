public class problem2
{
    public static void print_large(int[] array, int value)
  {
      for(int i = 0;i < array.length;i++){
          if(array[i]>= value){
              System.out.printf("%d\n", array[i]);
          }
      }
  }
    
  public static void main(String[] args)
  {
    int[] array1 = {105, 10, 5, 82, 15, 60};
    print_large(array1, 50);
  }
}