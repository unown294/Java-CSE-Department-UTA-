import java.io.PrintWriter;
import java.util.*;

public class problem9 {

public static void print_special_to_file(String word,String filename){
        char repeatedChar = 'j';
        int counter = 1;
        String reword = "";
        PrintWriter out = null;
        try{
            out = new PrintWriter(filename);
        }
        catch(Exception e){
            System.out.printf("failed to open %s\n", filename);
        }
      out.printf("%s\r\n",reword);
    
        for(int i = 0;i < word.length();i++){
            for(int u = 0;u < counter;u++){
                repeatedChar = word.charAt(i);
                reword = reword + repeatedChar;
            }
            out.printf("%s\r\n",reword);
            reword = "";
            counter++;
        }
    out.close();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter the filename: ");
        String filename = in.next();
        String word = "Texas";
        print_special_to_file(word, filename);
    }
    
}
