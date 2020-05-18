package com.company.Game;

import com.company.models.PicturePokerCard;
import com.company.models.PicturePokerDeck;
import com.company.models.PicturePokerCardValues;

import java.util.List;

public class PicturePoker {
    public static void run(){
        System.out.println("Mario Poker!");
        PicturePokerDealer dealer = new PicturePokerDealer("Luigi");
        System.out.println("Table dealer:" + dealer.getName());
        PicturePokerHand hand = new PicturePokerHand(dealer.deal());
        System.out.println("\n\nCurrent hand:");
        showPicturePokerList(hand.getHand());
        System.out.println("Hand value.: " + hand.checkHand(hand.getHand()));
        hand.checkHand(hand.getHand());



    }
    private static void showPicturePokerList(List<PicturePokerCard> cardList) {
        System.out.println("Size:" + cardList.size());
        for (PicturePokerCard card: cardList) {
            System.out.println(card);
        }
    }
}