package me.danielcrawley.compsci.term3;

import java.util.Random;

mport java.util.Random;

public class DeckOfCards {
    private Card[] deck; //array of Card objects
    private int currentCard;// index of next Card to be dealt(0-51)
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    /*initalize deck and current card */

        for (int i =0;i<NUMBER_OF_CARDS ;i++ ){
         String face;
            String suit;
            deck[i] = new Card(,suits[i/13])



        }
    /*populate deck with Card objects
      hint: Use modulo and division operations with 13
      and one for loop */


    }

    public void shuffle() {
        // after shuffling, dealing should start at deck[ 0 ] again
   /* reinitialize currentCard    */
        currentCard = 0;


        // for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            int x = randomNumbers.nextInt(52);
     /* select a random number between 0 and 51 */
            Card temp = deck[x];
            deck[x] = deck[first];
            deck[first] = temp;
       //DONE
     /* swap current Card with randomly selected Card */


        }
    }

    public Card dealCard() {
  /* if determine whether Cards remain to be dealt
     return current card, else return null */
        if (currentCard < deck.length) {
            currentCard++;
            return deck[currentCard - 1];

        } else
            return null;
        //DONE

    }

}