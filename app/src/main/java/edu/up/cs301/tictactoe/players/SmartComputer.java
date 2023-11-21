package edu.up.cs301.tictactoe.players;

import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.game.GameFramework.players.GameComputerPlayer;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;

public class SmartComputer extends GameComputerPlayer {
    /**
     * constructor
     *
     * @param name the player's name (e.g., "John")
     */
    public SmartComputer(String name) {
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        if(info instanceof FiGameState){
            FiGameState gameState = (FiGameState) info;
            if(this.playerNum == gameState.getPlayerId()) {
                while (gameState.getActionChoices() < 4) {
                    if(gameState.)
                    if(/*check if human player has 4 cards*/){
                        if(/*check if cards are same*/){
                            if(/*check if card is in treasure deck*/) {
                                game.sendAction(/*give card*/);
                                gameState.setActionChoices(gameState.getActionChoices()+1);
                            }
                        }
                    }

                    }

                                /*
            first always drawTreasure cards
            check if ai has 4 of the same treasure cards in hand
                if yes then check if the tile corresponds to the treasure cards in hand
                    if yes capture treasure
                    if no move to a different tile
                if no then check if any other player has 3 of the same treasure cards in their hand and the ai also has that treasure card
                    if yes give that treasure card to that player
                    if no check if any adjacent tile is flooded
                        if yes shore up and flip that tile to empty
                        if no move to a random tile
             last always drawFlood cards
             */
                }
            }
        }
    }
}
