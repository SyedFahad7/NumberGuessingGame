package com.numberguessing;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5; // Maximum number of attempts per round
        int score = 0; // User's score

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

            int attempts = 0; // Number of attempts for the current round
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts!");
                    int roundScore = maxAttempts - attempts + 1; // Calculate score for the round
                    score += roundScore; // Add round score to total score
                    System.out.println("Round score: " + roundScore);
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Try again! The number I'm thinking of is higher than " + guess + ".");
                } else {
                    System.out.println("Try again! The number I'm thinking of is lower than " + guess + ".");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
