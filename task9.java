import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a positive integer N > 0: ");
        int N = in.nextInt();
        int c = 1;
        if (N > 0){
            String sc = "*";
            String sc2 = "*";
            while(true){
                sc = "*" + sc2;
            }
        }
        else{
            System.out.printf("Exiting...\n");
        }
    }
    
}
