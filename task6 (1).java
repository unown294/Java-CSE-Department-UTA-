import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a variable that contains at least five letters: ");
        String s = in.nextLine();
        char first = s.charAt(0);
        char second = s.charAt(1);
        String next = s.substring(2,5);
        System.out.printf("The first letter of s is %c\n",first);
        System.out.printf("The second letter of s is %c\n",second);
        System.out.printf("The third, fourth, and fifth letters of s is %s\n",next);
    }
    
}
