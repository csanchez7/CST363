/* Decks of Cards Program
 * Description: TBD
 * By: John Seals, Hanna Bonert, Dustin Fehlman, and Carlos Sanchez 
 */

public class A3 {
    
    public static void main(String[] args) {
        
    }
}

class Card {
    private char value;
    private Suit suit;
    private boolean errorFlag;
    
    private enum Suit {clubs, diamonds, hearts, spades}
    
    Card(char value, Suit suit){
        
    }
    
    public String toString() {
        return "";
    }
    
    public boolean equals(Card card) {
        return false;
    }
    
    public boolean isValid(char value, Suit suit) {
        return false;
    }
    
    //Mutators
    public boolean set(char value, Suit suit) {
        return false;
    }
    
    //Accessors
    public Suit getSuit() {
        return this.suit;
    }
    
    public char getValue() {
        return this.value;
    }
    
    public boolean getErrorFlag() {
        return this.errorFlag;
    }
}

class Hand {
    
}

class Deck {
    
}
