import java.util.Scanner;

public class task7 {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter low: ");
        int low = in.nextInt();
        System.out.printf("Enter high: ");
        int high = in.nextInt();
        if (low < high){
            for(int v = low; v <= high; v++){
                if(!(v % 4 == 0)){
                    System.out.printf("%d\n", v);
                }
            }
        }
        else
        {
            System.out.printf("no numbers found\n");
        }
    }
    
}
