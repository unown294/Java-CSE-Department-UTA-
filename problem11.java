public class problem11 {

    public static void check_ab(String word){
        int a_counter = 0;
        int b_counter = 0;
        char testchar = 'j';
        for(int i = 0;i < word.length();i++){
            testchar = word.toLowerCase().charAt(i);
            if(testchar == 'a'){
                a_counter++;
            }
            if(testchar == 'b'){
                b_counter++;
            }
        }
        if(a_counter == b_counter){
            System.out.printf("True, because there are %d A's and %d B's\n",a_counter,b_counter);
        }
        else{
            System.out.printf("False, because there are %d A's and %d B's\n",a_counter,b_counter);
        }
        
    }
    
    public static void main(String[] args) {
        String word = "Barbados";
        check_ab(word);
    }
    
}
