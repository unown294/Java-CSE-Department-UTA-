import java.io.File;
import java.util.*;

public class problem4
{
  public static void print_array_list(ArrayList<Integer> list){
      for(int i = 0;i < list.size();i++){
          System.out.printf("%d\n", list.get(i));
      }
  }
  
  public static ArrayList<Integer> keep_large(ArrayList<Integer> list, int threshold){
      for(int i = 0;i < list.size();i++){
          if(list.get(i) <= threshold){
              list.remove(i);
          }
          if(list.get(i)==5){
              list.remove(i);
          }
      }
      return list;
  }
  
  public static void main(String[] args)
  {
    ArrayList<Integer> list1 = new ArrayList();
    list1.add(105);
    list1.add(10);
    list1.add(5);
    list1.add(82);
    list1.add(15);
    list1.add(60);
    
    ArrayList<Integer> list2 = keep_large(list1, 50);
    print_array_list(list2);
  }
}