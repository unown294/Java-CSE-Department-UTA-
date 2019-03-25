
import java.util.ArrayList;


public class problem25 {

    public static void print_combinations(String[] array1, String[] array2){
        ArrayList<String> Combo = new ArrayList<String>();
        String combine = "";
        for(int i = 0; i < array1.length;i++){
            for(int u = 0; u < array2.length;u++){
                combine = array1[i] + " " + array2[u];
                Combo.add(combine);
                combine = "";
            }
        }
        for(int i = 0; i < Combo.size();i++){
            System.out.printf("%s\n", Combo.get(i));
        }
    }
    
    public static void main(String[] args) {
    String[] array1 = {"red","white","green","blue"};
    String[] array2 = {"shirt","pants","shoes"};
    print_combinations(array1, array2);
    }
    
}
