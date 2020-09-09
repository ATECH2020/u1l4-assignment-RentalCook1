import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        
         int hourDegreesPast = scanner.nextInt();
      
        /*
         *  your code goes here
         */
         int minuteDegreesPast = 12*(hourDegreesPast%30);
         System.out.print(minuteDegreesPast);

        // closing the scanner object
        scanner.close();
    }
}