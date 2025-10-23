package org.example.cards;

import com.google.inject.Singleton;
import org.example.cards.classes.PaymentCard;

import java.util.ArrayList;

@Singleton
public class CardList {
    public ArrayList<PaymentCard> cards = new ArrayList<PaymentCard>();
}
