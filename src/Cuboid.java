public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // For example: if the 3 sides are 10, 10, and 10, then you program should
        // produce the following output:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 5.0;
        double b = 3.2;
        double c = 3.0;
        double surface = 2 * a*b+ 2*a*c +2*b*c;
        double volume = a*b*c;
        System.out.println("Surface "+ surface + "  Volume " + volume);



    }
}
