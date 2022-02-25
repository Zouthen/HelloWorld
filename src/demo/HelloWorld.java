package demo;

//Hello World

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        System.out.println("Hello Dat22V1!");
        }
        */

        // Create scanner object (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Guess
        int guess = 0;
        // Counter
        int count = 0;
        int count1 = 0;

        // Create random number 1-10
        Random randomNumber = new Random();
        int answer = randomNumber.nextInt(10) + 1;

        // Intro
        System.out.println("Welcome to my guessing game");
        System.out.println();

        // loop
        while (guess != answer) { // != means different from

            // Ask for a number
            System.out.print("Enter a number between 1-10: ");
            System.out.println();

            // Load number from keyboard
            guess = scanner.nextInt();
            count++;

            // Check answer
            if (guess > answer) {
                System.out.println("Guess is greater than answer");
                System.out.println("Try again");
                System.out.println();
            } else if (guess < answer) {
                System.out.println("Guess is less that answer");
                System.out.println("Try again");
                System.out.println();
            } else if (guess == answer) {
                System.out.println("Guess is equal to answer");
                System.out.println();
                System.out.println("Congratulations you won!");
                System.out.println("You used " + count + " tries");
            }

        }

    }
}

