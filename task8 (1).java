import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a positive integer N > 1: ");
        int N = (int)in.nextDouble();
        int s = (int)0;
        int p = 0;
        
        if (N > 1){
            while (true){
                p = (int)Math.pow(N, s);
                if (p <= 40000){
                    System.out.printf("%d\n", p);
                    s++;
                }
                else {
                    break;
                }
            }
        }
        System.out.printf("Exiting...\n");
    }
    
}
