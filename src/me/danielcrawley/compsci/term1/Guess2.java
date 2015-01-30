// This program plays a simple guessing game with the user.
package me.danielcrawley.compsci.term1;

import java.util.*;

public class Guess2 {
    public static final int MAX_GUESS = 100; //user will guess number from 1 to MAX_GUESS=100

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();
        int numGames = 0;  // total number of games user play
        int totGuesses = 0; // total number of guesses in all games played
        String response; 
// while or do while loop
        // Call playGame to play one game.
        // ask if user wants to play again.
        // update numGames and totGuesses.
        do { totGuesses += playGame(console); 
          numGames++;
            System.out.println("Play again?"); 
            response = console.nextLine(); 
        }while (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")); 
        
        
        
        
        
        
        
        
        //once user is done playing, report results.
        reportResults(numGames, totGuesses);
    }

    public static void giveIntro() {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and "
                           + MAX_GUESS);
        System.out.println("and will allow you to guess until you get it.");
        System.out.println("For each guess, I will tell you whether the");
        System.out.println("right answer is higher or lower than your guess.");
        System.out.println();
    }

    // play one game, return number of guesses user took to get right answer.
    public static int playGame(Scanner console) {
        Random r = new Random();
        int numGuesses = 0;
        System.out.println("I'm thinking of a number...");
        int correctAnswer = r.nextInt(MAX_GUESS) +1;
        int answer = 0;
        while (answer != correctAnswer){
         numGuesses++;
          answer = console.nextInt();
         if (answer > correctAnswer) {
          System.out.print("Too High!"); 
         }
         else if (answer < correctAnswer){
           System.out.println("Too Low!"); 
         }
          
        }
        
        
        
        
        
        System.out.println("You got it right in " + numGuesses + " guesses");
        System.out.println();
        return numGuesses;
    }

    // report total games, total guesses and average guess per game.
    public static void reportResults(int numGames, int totGuesses) {
        System.out.println("Overall results:");
      
        
        
        
        
    }
}