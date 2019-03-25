import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a word: ");
        String word = in.next();
        word = word.replaceAll("[AEIOUaeiou]", "");
        System.out.printf("%s\n", word);
    }
    
}
