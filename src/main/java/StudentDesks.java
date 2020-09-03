import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1Students = scanner.nextInt();
        int class2Students = scanner.nextInt();
        int class3Students = scanner.nextInt();
        /*
         *  your code goes here
         */
         int class1Desks = class1Students/2 + class1Students%2 ;
         int class2Desks = class2Students/2 + class2Students%2 ;
         int class3Desks = class3Students/2 + class3Students%2 ;
         int totalDesks = class1Desks + class2Desks + class3Desks ;
         System.out.println(totalDesks);
        // closing the scanner object
        scanner.close();
    }
}