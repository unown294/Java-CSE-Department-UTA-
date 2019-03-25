import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter an Integer M: ");
        int M = in.nextInt();
        System.out.printf("Enter an Integer N: ");
        int N = in.nextInt();
        int s = 11;
        int i = M / 10;
        int v = s;
        int counter = 0;
        // write if statement for integers less than 11
        if (i < 1)
        {
            i = 1;
        }
        while(true)
        {
            v = s * i;
            if (M <= v && v <= N)
            {
                i++;
                counter++;
            }
            else
            {
                System.out.printf("%d numbers between %d and %d are multiples of %d.\n", counter, M, N, s);
                break;
            }
        }
        System.out.printf("Exiting...\n");
    }
    
}
