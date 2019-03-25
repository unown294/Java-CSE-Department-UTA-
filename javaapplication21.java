import java.util.*;


public class javaapplication21{

public static void main(String[] args){
String text = "Today was a hot summer day full of hot pineapples";
    String[] word = text.split(" ");
for(int i = 0; i < word.length; i++){
    System.out.printf("word [%d] = %s\n", i, word[i]);
}
}
}