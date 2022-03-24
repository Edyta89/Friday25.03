import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number1 = scan.nextInt();
        System.out.println(++number);
        System.out.println(++number1);



    }
}
