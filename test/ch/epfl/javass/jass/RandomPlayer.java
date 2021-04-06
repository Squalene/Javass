/**
 * 
 */
package ch.epfl.javass.jass;

import java.util.Random;

import ch.epfl.javass.jass.Card.Color;

/**
 * @author Antoine Masanet (288366)
 * @author Loïc Houmard (297181)
 *
 */
public final class RandomPlayer implements Player {
    private final Random rng;

    public RandomPlayer(long rngSeed) {
      this.rng = new Random(rngSeed);
    }
    
    @Override
    public Color chooseTrump(CardSet hand, boolean canPass) {
        return Color.ALL.get(rng.nextInt(4));
    }

    @Override
    public Card cardToPlay(TurnState state, CardSet hand) {
      CardSet playable = state.trick().playableCards(hand);
      return playable.get(rng.nextInt(playable.size()));
    }
  }
