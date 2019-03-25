import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter an integer N: ");
        int N = in.nextInt();
        boolean N_is_holy = false;
        int i = 0 ;
        int b = i*i + i;
        while (i < N)
        {
            b = i*i + i;
            if (N < 2)
            {
                N_is_holy = false;
                i = N;
            }
            else if (N == b)
            {
                N_is_holy = true;
                i = N;
                break;
            }
            else
            {
                N_is_holy = false;
            }
            i++;
        }
        if (N_is_holy)
        {
            System.out.printf("%d is a holy number in Numerion.\nExiting...\n", N);
        }
        else 
        {
            System.out.printf("%d is not a holy number in Numerion.\nExiting...\n",N);
        }
        
    }
    
}
