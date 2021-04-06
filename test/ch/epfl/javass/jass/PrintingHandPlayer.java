package ch.epfl.javass.jass;

import ch.epfl.javass.jass.Card.Color;

public class PrintingHandPlayer implements Player{
    private final Player underlyingPlayer;

    public PrintingHandPlayer(Player underlyingPlayer) {
      this.underlyingPlayer = underlyingPlayer;
    }
    
    @Override
    public Card cardToPlay(TurnState state, CardSet hand) {
      return underlyingPlayer.cardToPlay(state, hand);
    }
    
    @Override
    public Color chooseTrump(CardSet hand, boolean canPass) {
        return underlyingPlayer.chooseTrump(hand, canPass);
    }
    
    @Override
    public  void updateHand(CardSet newHand) {
        System.out.println("Nouvelle main: "+ PackedCardSet.toString(newHand.packed()));
    }
    
}
