import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
          int totalSecs1 = (hours1*3600) + (minutes1*60) + seconds1 ;
          int totalSecs2 = (hours2*3600) + (minutes2*60) + seconds2 ;
          int difference = (totalSecs2 - totalSecs1) ;
          System.out.print(difference);
        // closing the scanner object
        scanner.close();
    }
}