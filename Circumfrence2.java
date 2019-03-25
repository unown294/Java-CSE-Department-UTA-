import java.util.Scanner;
//Scanner allows us to gather input from the user
//In order for the scanner to run the following statement needs to be listed at the top of the program, and is necessary to start the scanner.
//To create a Scanner object, we need to:
// - put the import statement at the top
// - Create a Scanner Object, as shown in the first line of the main method.
//   EX: Scanner in = new Scanner(System.in);
public class Circumfrence2 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        // The three values listed below are declerations and the last 2 codes are assignments
        //double radius = 20.231; //only change for hardcodding example
        // The newest code variables are "import","Scanner", and "System.out.printf"
        System.out.printf("Please enter the radius: ");
        // printf is crucial for gathering user info.
        // What the printf does is waits for the user to enter a variable to use in the next following codes.
        // In other words its to put the number if it ask for a number
        double radius = in.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        
        //double is just for setting up a variable for the jave to read
        //For integers (positive and negative), use "int"
        //For floating point numbers, use "double"
        //Variables are case-sensitive and cannot be equal to the following reserved words
        //double, class, int, public
        System.out.println(circumference);
        System.out.println(area);
    }
    public static void secondary(String[] args){
        int candies = 5;
        // This is a decleration, "candies = 5"
        // Declerations start with int
        System.out.println(candies);
        candies = 7;
        System.out.println(candies);
        candies = candies + 10;
        // These two are assignments
        System.out.println(candies);
                }
    public static void third(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter number of weeks:  ");
        int weeks = in.nextInt();
        int days = weeks * 7;
        System.out.printf("There are %d days in %d weeks\n",days, weeks);
    }
    }
