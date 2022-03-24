import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number from 1 to 8");
        int number = scanner.nextInt();
      int a = 6;
      switch (number){
          case 1 :
              System.out.println("The stored number is higher");
          break;
          case 2:
              System.out.println("The stored number is higher");
          break;
          case 3 :
              System.out.println("The stored number is higher");
              break;
          case 4:
              System.out.println("The stored number is higher");
              break;
          case 5:
              System.out.println("The stored number is higher");
              break;
          case 6:
              System.out.println("You found the number: 6");
              break;
          case 7:
              System.out.println("The stored number is lower");
              break;
          case 8:
              System.out.println("The stored number is lower");
              break;


      }






    }
}
