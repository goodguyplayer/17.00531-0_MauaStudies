package com.company.interfaces;

import com.company.models.PicturePokerCard;
import com.company.models.PicturePokerHandValues;

import java.util.List;

public interface PicturePokerCheckHand {
    PicturePokerHandValues checkHand(List<PicturePokerCard> cardlist);

}
