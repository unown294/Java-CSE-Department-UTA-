import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("When is the first Sunday this March? ");
        int date = in.nextInt();
        if((date >= 1) && (date <=7)){
            int sunday1 = date;
            int sunday2 = sunday1 + 7;
            int sunday3 = sunday2 + 7;
            int sunday4 = sunday3 + 7;
            int sunday5 = sunday4 + 7;
            System.out.printf("This March, Sundays fall on:\n");
            System.out.printf("March %d\n", sunday1);
            System.out.printf("March %d\n", sunday2);
            System.out.printf("March %d\n", sunday3);
            System.out.printf("March %d\n", sunday4);
        
            if(sunday4 <= 24){
                System.out.printf("March %d\n", sunday5);
            }
        }
        else{
            System.out.printf("invalid entry\n");
        }
    }
}
