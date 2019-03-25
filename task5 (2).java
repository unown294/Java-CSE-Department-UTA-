import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter real number N1: ");
        double N1 = in.nextDouble();
        System.out.printf("Please enter real number N1: ");
        double N2 = in.nextDouble();
        double S1 = N1 * N2;
        double S2 = N1 % N2;
        
        System.out.printf("%.6f * %.6f = %.2f\n", N1, N2, S1);
        System.out.printf("%.6f / %.6f = %.2f\n", N1, N2, S2);
        System.out.printf("%.6f raised to the power of %.6f = %.2f\n", N1, N2, S1);
    }
    
}
