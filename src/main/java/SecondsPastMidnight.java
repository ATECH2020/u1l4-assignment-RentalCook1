import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        System.out.println("enter the number of seconds past midnight");
        int number = scanner.nextInt();

        //Your code goes here
        int secsPast = number ;
        int hoursPast = secsPast/3600 ;
        int minsPast = secsPast/60 ;
        System.out.println(hoursPast+ " " +minsPast ) ;
        // closing the scanner object
        scanner.close();
    }
}