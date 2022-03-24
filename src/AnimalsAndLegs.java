import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put two numbers");
        int chicken = scanner.nextInt();
        int pigs = scanner.nextInt();
        int chickenLegs = chicken * 2;
        int pigLegs = pigs *4;
        int all = pigLegs+ chickenLegs;
       System.out.println("All legs " + all );
     
    }
}
