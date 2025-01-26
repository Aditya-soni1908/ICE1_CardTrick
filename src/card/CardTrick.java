/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author AIDTYA SONI 991760172
 * @date Modified: 26 Jan, 2025
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(0, 13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(0, 4)]);
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        
        
        // add one luckcard hard code 2,clubs
        Card card = new Card();
        card.setValue(2);
        card.setSuit(Card.SUITS[1]);
        // and search magicHand here
        boolean cardfound = false;
        for (Card c : magicHand) {
            if (card.getValue() == c.getValue() && card.getSuit().equals(c.getSuit())) {
                cardfound = true;
                break;
            }}
        //Then report the result here
        if (cardfound == true) {
            System.out.println("Your card is in magic hand.");
        } else {
            System.out.println("Your card is not in magic hand.");
        }
        
    }
    
}
