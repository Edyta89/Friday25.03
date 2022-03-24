public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int currentHoursToSec = currentHours * 3600;
        int currentMinutesToSec = currentMinutes *60;
        int day = 24 * 3600;
        int remainingSec = day-currentSeconds-currentHoursToSec-currentMinutesToSec;
        System.out.println(remainingSec);



        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
    }
    }

