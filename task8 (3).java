import java.util.*;

public class task8
{
  
  public static void print_string_array_list(String name, ArrayList<String> a)
  {
    System.out.printf("%7s: ", name);
    if (a == null)
    {
      System.out.printf("Null array!\n\n");
      return;
    }
    
    for (int i = 0; i < a.size(); i++)
    {
      System.out.printf("%12s", a.get(i));
    }
    System.out.printf("\n");
  }
 
  public static ArrayList<String> array_list_merge(ArrayList a,ArrayList b){
      ArrayList<String> results = new ArrayList(a.size()+ b.size());
      //results.add("Chicago");
      //results.add("New York");
      //results.add("Dallas");
      //results.add("Berlin");
      //results.add("London");
      //results.add("Paris");
      //results.add("Rome");
      //String[] a + String[] b; //what i want it to do but if only life were that simple
      for(int i = 0; i < a.size(); i++){
          results.add(i,(String) a.get(i));
      }
      int n = a.size();
      for(int i = 0; i < b.size(); i++){
          results.add(n, (String) b.get(i));
          n++;
      }
      int j = a.size();

//create a for loop that breaks out the individual words from there orriginal arrays and then rebuilds them in the correct order in the new array.
      return results;
  }
  
  public static void main(String[] args)
  {
    ArrayList<String> a = new ArrayList<String>();
    a.add("Chicago");
    a.add("New York");
    a.add("Dallas");
    
    ArrayList<String> b = new ArrayList<String>();
    b.add("Berlin");
    b.add("London");
    b.add("Paris");
    b.add("Rome");
      
    ArrayList<String> result = array_list_merge(a, b);
    print_string_array_list("a", a);
    print_string_array_list("b", b);
    print_string_array_list("result", result);
  }
}