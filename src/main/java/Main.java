// project 06 Time Adder ??
/*
  1. give current time in hour, min, sec
  2. give time to move forward in hour, min, sec
  3. evaluate new time using what was added
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);

        // get current hour and minute
        System.out.println("Enter current hour: ");
        int currentHour = scanny.nextInt();
        System.out.println("Enter the current minute: ");
        int currentMinute = scanny.nextInt();

        // hour or minute to advance by
        System.out.println("How many hours would you like to advance: ");
        int advanceHour = scanny.nextInt();
        System.out.println("How many minutes would you like to advance: ");
        int advanceMinute = scanny.nextInt();

        // calculate the time addition
        int answerHour = 0;
        int answerMinute = 0;
        int carryMinute = 0;
        boolean isNextDay = false;

        answerMinute = currentMinute + advanceMinute;
         if (answerMinute >= 60) {
             answerMinute -= 60;
             carryMinute = 1;
         }
         answerHour = currentHour + advanceHour + carryMinute;
         if (answerHour >= 24) {
             answerHour -= 24;
             isNextDay = true;
         }
        if (isNextDay) {
            System.out.println("The answer is " + answerHour + ":" + answerMinute + " on the next day.");
        } else {
            System.out.println("The answer is " + answerHour + ":" + answerMinute + " on the next day.");
        }
    }
}
