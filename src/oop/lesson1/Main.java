package oop.lesson1;

public class Main {

    public static void main(String[] args) {
        int i = 100;
        while (i > 0) {
            System.out.printf("%d ", i);
            i = i - 5;
        }
        System.out.println();
        System.out.println(timeToSki(35));
        System.out.println(timeToSki(15));
        System.out.println(timeToSki(100));

        drawPattern(5);
        
        Card myFirstCard = new Card("Jack", "Hearts", 11);
        System.out.printf("My card is %s%n", myFirstCard.toString());
        
        Card mySecondCard = new Card("Ace", "Spades", 14);
        System.out.printf("My second card is %s%n", mySecondCard.toString());
        
        DeckOfCards theDeck = new DeckOfCards();
        System.out.printf("The deck has the following cards: %n%s", theDeck.toString());
    }

    private static boolean timeToSki(int i) {
        return i > 30;
    }

    private static void drawPattern(int count) {
        for ( ; count > 0; count--) {
            for (int i = 1; i <= count; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
