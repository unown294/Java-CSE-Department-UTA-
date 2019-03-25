public class problem7 {

    public static void print_special(String word){
        char repeatedChar = 'j';
        int counter = 1;
        String reword = "";
        for(int i = 0;i < word.length();i++){
            for(int u = 0;u < counter;u++){
                repeatedChar = word.charAt(i);
                reword = reword + repeatedChar;
            }
            System.out.printf("%s\n",reword);
            reword = "";
            counter++;
        }   
    }
    
    public static void main(String[] args) {
        String word = "Texas";
        print_special(word);
    }
    
}
