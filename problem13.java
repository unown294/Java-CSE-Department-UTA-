import java.util.*;

public class problem13 {

    public static void find_N(int testn){
        double u = 0;
        int o = 0;
        for(int n = 0;u < testn;n++){
            u = Math.pow(2, n) + Math.pow(3,n);
            o++;
        }
    o--;
    if(testn != u){
        o = -1;
    }
    if(testn < 0){
        o = -1;
    }
    System.out.printf("N = %d\n",o);
    }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a integer: ");
        int testn = in.nextInt();
        find_N(testn);
    }
    
}
