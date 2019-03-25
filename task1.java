public class task1
{
  public static void foo(int a, int b)
  {
    System.out.printf("1: a = %d\n", a);
    System.out.printf("2: b = %d\n", b);
    a = a*a;
    b = 2*b;
    System.out.printf("3: a = %d\n", a);
    System.out.printf("4: b = %d\n", b);
  }
          
  public static void main(String[] args)
  {
    int a = 3;
    int b = 5;
    foo(b, a);
    System.out.printf("5: a = %d\n", a);
    System.out.printf("6: b = %d\n", b);
  }
}