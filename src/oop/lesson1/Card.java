package oop.lesson1;

public class Card {

    private String faceName, suit;
    private int faceValue;

    public Card(String faceName, String suit, int value) {
        this.faceName = faceName;
        setSuit(suit);
        setFaceValue(value);
    }

    private void setSuit(String suit) {
        if (suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds")
                || suit.equalsIgnoreCase("clubs") || suit.equalsIgnoreCase("spades")) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("suits must be hearts, diamonds, sprades or clubs");
        }
    }

    private void setFaceValue(int value) {
        if (value >= 2 && value <= 14) {
            faceValue = value;
        } else {
            throw new IllegalArgumentException("card must have values in the range of 2-14");
        }
    }
    
    @Override
    public String toString(){
        return faceName + " of " + suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
    
}
