package me.danielcrawley.compsci.term3;

public class Card {
    private String face;
    private String suit;

    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
        //DONE
    }

    //returns format is, for example, "King of Hearts".
    @Override
    public String toString() {
        return (this.face + " of " + this.suit);
        //DONE
    }

}