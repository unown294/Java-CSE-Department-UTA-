/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error.checking;

import java.util.Scanner;

/**
 *
 * @author Dalton
 */
public class ErrorChecking {

    /**
     * @param args the command line arguments
     */
    //public static boolean sanity_checker(String args){
    //    if()
    //    
    //}
    public static void print_menu(){
        System.out.printf("1: print leaders\n");
        System.out.printf("q: quit\n");
    }
    public static String get_user_choice(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a menu choice: ");
        String choice = in.nextLine();
        return choice;
    }
    public static void process_user_choice(String choice){
        if(choice.equals("q")){
            System.out.printf("Exiting...");
            System.exit(0);
        }
        else if(choice.equals(1)){
            
        }
    }
    
    public static void main(String[] args) {
    while (true){
        print_menu();
        String choice = get_user_choice();
        process_user_choice();
    }
    }
    
}
