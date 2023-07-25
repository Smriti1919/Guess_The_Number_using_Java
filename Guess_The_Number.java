package academy.learnprogramming;

import java.util.Scanner;

public class Guess_The_Number {
    public void guess() {
        Scanner sc= new Scanner(System.in);
        int no = 1 + (int)(100*Math.random());
        int trials = 7;
        int i, guessedNumber;
        System.out.println(
                "A number is chosen between 1 to 100. Guess the number within 10 trials.");
        for (i = 0; i < trials; i++) {
            System.out.println("Guess the number:");
            guessedNumber = sc.nextInt();

            if (no == guessedNumber) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (no > guessedNumber && i != trials - 1) {
                System.out.println("The number is greater than " + guessedNumber);
            }
            else if (no < guessedNumber && i != trials - 1) {
                System.out.println("The number is less than " + guessedNumber);
            }
        }
        if (i == trials) {
            System.out.println("You have exhausted all your trials.");
            System.out.println("The number was " + no);
        }
    }
}
