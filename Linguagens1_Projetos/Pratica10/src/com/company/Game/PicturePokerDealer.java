package com.company.Game;

import com.company.models.PicturePokerCard;
import com.company.models.PicturePokerDeck;

import java.util.ArrayList;
import java.util.List;

public class PicturePokerDealer {
    private String name;
    private PicturePokerDeck deck;

    public PicturePokerDealer(String name){
        this.name = name;
        this.deck = new PicturePokerDeck();
    }

    public List<PicturePokerCard> deal(){
        List<PicturePokerCard> newHand = new ArrayList<>();
        for (int card = 0; card < 5; card++ ){
            newHand.add(deck.getRandomCard());
        }
        return newHand;
    }

    public PicturePokerDeck getDeck() {
        return deck;
    }

    public String getName() {
        return name;
    }
}
