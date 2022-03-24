import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("Request about distance in miles in decimal number");
        Scanner scan = new Scanner(System.in);
       double miles = scan.nextDouble();
        double convert = 1.609344d ;
        double km = miles* convert;
       System.out.println("This is  "+ km +" km");


    }
}
