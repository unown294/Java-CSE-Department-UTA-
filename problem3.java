import java.util.*;

public class problem3
{
  public static void print_array_list(ArrayList<Integer> list){
      for(int i = 0; i < list.size();i++){
          System.out.printf("%d\n",list.get(i));
      }
  }
  
  public static ArrayList<Integer> keep_large(int[] array, int threshold){
    ArrayList<Integer> list = new ArrayList();
      for(int i = 0;i < array.length;i++){
          if(array[i]>= threshold){
              int v = array[i];
              list.add(v);
          }
      }
      return list;
  }
  
  public static void main(String[] args)
  {
    int[] array1 = {105, 10, 5, 82, 15, 60};
    ArrayList<Integer> list = keep_large(array1, 50);
    print_array_list(list);
  }
}
