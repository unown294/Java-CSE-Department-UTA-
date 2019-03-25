public class hello1 {

    public static void main(String[] args) {
     String s1 = "hello";
    
    if (s1.equals("goodbye"));
    {
      System.out.printf("checkpoint 1\n");
    }
    
    if (s1.equals("goodbye"))
    {
      System.out.printf("checkpoint 2\n");
    }
    
    if (s1.equals("hello"))
    {
      System.out.printf("checkpoint 3\n");
    }
    else if (!(s1.equals("goodbye")))
    {
      System.out.printf("checkpoint 4\n");
    }
    else if (s1.equals("hello"))
    {
      System.out.printf("checkpoint 5\n");
    }
    }
    
}
