import java.util.Scanner;

public class notes {
public static void secondary(String[] args) {
        // TODO code application logic here
        int x;
        x = 2;
        System.out.printf("x = %d\n", x);
       int y = 2;
       double z = 3.0;
       String h = "2"; // correct for for a string
       char i = '7'; // correct form for a char
    }

public static void third(String[] args) {
    double x = 5.5;
    x++;
    System.out.println(x);
    double price = 18.53;
    int dollars = (int) price;
    System.out.printf("Rounded price: %d dollars\n", dollars);
    }
public static void fourth(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.printf("Please list the number of weeks it has been: ");
    int weeks = (int)in.nextDouble();
    final int days_per_week = 7;
    int days = weeks * days_per_week;
    String month = "July";
    System.out.printf("There are %d days in %d weeks for the month of %s\n", days, weeks, month); // %d is for decimal, %s is for string, %f is for double. Just remember the damn thing. % is a place holder in the printf code.
    
}

public static void date(String[] args) {
    // if statements are a test if the variable falls in a certain range for example a number range
    // indentations are for a programmer to figure out what goes with what. For example if statements for a variable of v1 and if statements for a variable of v2.
    // boolean is for things that need to be executed.
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter the name of the month: ");
    String month = in.nextLine();
    month = month.toLowerCase();
    String m1 = month.substring(0,1).toUpperCase();
    month = m1 + month.substring(1);
    //System.out.println(month);
    
    if ((month.equals("January")) || (month.equals("March")) ||
        (month.equals("May")) || (month.equals("July")) || 
        (month.equals("August")) || (month.equals("October")) || 
        (month.equals("December")))
    {
        System.out.printf("There are 31 days in the month of %s \n", month);
    }
    else if (month.equals("February"))
    {
        System.out.printf("There are 28 days in the month of %s\n", month);
    }
    else
    {
        System.out.printf("Please make sure that both the spelling of the month\n and that it is a valid month.\n");
    }
    }

public static void numbers(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter an integer: ");
    int number = in.nextInt();
    int result;
    if (number > 0)
    {
        if (number >= 0)
        {
            result = number * number;
        }
        else 
        {
            result = 10 * number;
        }
        System.out.printf("The resuly is %d. \n", result);
    }
    else
    {
        System.out.printf("invalid integer\n");
    }
 }
public static void income(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter your income: ");
    int income = (int)in.nextDouble();
    
    double tax = 0;
    if (income <= 9225)
    {
        tax = income * 0.1;
    }
    else if (income <= 37450)
    {
        tax = 922.50 + 0.15 * (income - 9225);
    }
    else
    {
        System.out.printf("Please make sure the value of %d is correct.\n", income);
    }
}
public static void looptest(String[] args) {
    // Loops are for use in a range of numbers
    // while is used alongside loops
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter a interger that is prime: ");
    int N = (int) in.nextDouble();
    int i = 1;
    while (i <= N)
    {
        System.out.printf("%d\n", i);
        i = i + 1;
    }        
    System.out.printf("Done with printing the while loop.\n");
}
public static void prime(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter an integer to test: ");
    int N = (int) in.nextDouble();
    
    boolean N_is_prime = true;
    int i = 2;
    while (i < N)
            {
                if (N % i == 0)
                {
                    N_is_prime = false;
                    i = N;
                }
                else
                {
                    N_is_prime = true;
                }
                i++;
            }
    if (N_is_prime)
    {
        System.out.printf("%d is prime.\n", N);
    }
    else 
    {
        System.out.printf("%d is not prime. \n",N);
    }
}
public static void counter(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter an integer: ");
    int N = in.nextInt();
    
    for (int i = N; i >= 0; i -= 2)
    {
        System.out.printf("%d\n", i);        
    }
    System.out.printf("Counting down %d to 0, with step 2. \n", N);
    
}

public static void trianglemultiple (String[] args){
    for (int i = 1; i <= 10; i++)
    {
        for (int j = 1; j <= 10; j++)
        {
            if (j > i)
            {
                break;
            }
            System.out.printf("%3d ", i*j);
        }
        System.out.printf("\n");
    }
}

public static void error_correcting (String[] args){
    while (true)
    System.out.printf("Please specify the number of seconds (between 1 and 86400): ");
    String low = in.nextInt();
    try
    {
        //the line thats breaking
    }
    catch (Exception e)
    {
        //what to execute if the exception is triggered
    }
    //pick up where left off
}

public static void main (String[] args){
    while (true)
    System.out.printf("Please specify the number of seconds (between 1 and 86400): ");
    String low = in.nextInt();
    try
    {
        //the line thats breaking
    }
    catch (Exception e)
    {
        //what to execute if the exception is triggered
    }
    //pick up where left off
}

public static void tests (String[] args){
    while (true)
    System.out.printf("Please specify the number of seconds (between 1 and 86400): ");
    String low = in.nextInt();
    try
    {
        //the line thats breaking
    }
    catch (Exception e)
    {
        //what to execute if the exception is triggered
    }
    //pick up where left off
    
    //use public static void "name" extend "file name in same project" {to pull from other files.
    
}
}

