import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number%2==0) {
            System.out.println("Number is even");
        }  else{
            System.out.println("Number is odd");
        }




    }
}
