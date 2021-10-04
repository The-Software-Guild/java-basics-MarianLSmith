package com.sg.foundations.basicsAssignment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        System.out.println("How many rounds would you like to play?");
        Scanner reader = new Scanner(System.in);
        Random rpsGen = new Random();

        int rounds = reader.nextInt();
//        reader.close();

        if ((rounds < 1) || (rounds > 10)) {
            System.out.println("Value must be between 1 and 10 (inclusive)");
            System.exit(0);
        }

        int round;
        int userScore = 0;
        int compScore = 0;
        int ties = 0;

        for (round = 1; round <= rounds; round++) {

            System.out.println("\nRound " + round + ":");
            System.out.println("Select rock, paper or scissors: \nRock = 1, Paper = 2, Scissors = 3");

            int userChoice = reader.nextInt();
            int compChoice = rpsGen.nextInt(3) + 1;

            if (userChoice == compChoice) {
                ties++;
            } else if (!(userChoice == compChoice)) {
                if (userChoice == 1) {
                    if (compChoice == 2) {
                        compScore++;
                    } else if (compChoice == 3) {
                        userScore++;
                    }
                } else if (userChoice == 2) {
                    if (compChoice == 1) {
                        userScore++;
                    } else if (compChoice == 3) {
                        compScore++;
                    }
                } else if (userChoice == 3) {
                    if (compChoice == 1) {
                        compScore++;
                    } else if (compChoice == 2) {
                        userScore++;
                    }

                } else {
                    System.out.println("Value must be 1, 2 or 3");
                    round--;
                }
            }
            System.out.println("Computer chose " + compChoice);
            System.out.println("Current Scores: User = " + userScore + ", computer = " + compScore + ", ties = " + ties);
            System.out.println("\n-----------------------------------\n");
        }
        if (userScore > compScore) {
            System.out.println("Congratulations, you win!");

        } else if (compScore > userScore) {
            System.out.println("Commiserations, you lose!");

        } else if (userScore == compScore) {
            System.out.println("It's a tie!");

        }
        System.out.println("Your score: " + userScore + ", Computer Score: " + compScore + ", ties: " + ties);
    }
}
