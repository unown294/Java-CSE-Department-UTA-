/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.*;
/**
 *
 * @author Dalton
 */

 class Longest
 {
public static void main(String args[]) throws FileNotFoundException  
{
    BufferedReader in = null;
    List<String> myList = new ArrayList<String>();
    try 
    {   
        in = new BufferedReader(new FileReader("C:\\filename.txt"));
        String str;
        while ((str = in.readLine()) != null) 
        {
            if (str.length() == 0) continue;                                

            myList.add(str);
        }
    } 
    catch (IOException e) 
    {
        e.printStackTrace();
    } 
    System.out.println("Contents of the ArrayList : "+myList);
    System.out.println("Size of the ArrayList : "+myList.size());
    String s = myList.remove(0);
    System.out.println(System.getProperty("line.separator"));
    System.out.println("Number of lines to be printed : "+s);
    System.out.println("After removing first element of ArrayList : "+myList);
    System.out.println("Size of the ArrayList : "+myList.size());               

    Comparator comparator=Collections.reverseOrder();                   
    Collections.sort(myList,comparator);
    System.out.println("After sorting ArrayList in Descending Order :"+myList);


    int x = Integer.parseInt(s);
    System.out.println(System.getProperty("line.separator"));


for (String s1 : myList) {
System.out.println(s1);
}
System.out.println(System.getProperty("line.separator"));

for(int i=0; i<x; i++){
        System.out.println(myList.get(i));
    }

   


  Comparator<String> x = new Comparator<String>()
    {
        @Override
        public int compare(String o1, String o2)
        {
            if(o1.length() > o2.length())
                return -1;

            if(o2.length() > o1.length())
                return 1;

            return 0;
        }
    };

    Collections.sort(mylist,  x);
}}