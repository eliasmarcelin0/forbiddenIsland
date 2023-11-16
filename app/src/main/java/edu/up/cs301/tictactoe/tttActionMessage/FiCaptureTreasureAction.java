package edu.up.cs301.tictactoe.tttActionMessage;

import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;

// other class variables
//Tile[] board;
//private HumanPlayer humanPlayer; // player reference

public class FiCaptureTreasureAction extends GameAction {

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public FiCaptureTreasureAction(GamePlayer player) {
        super(player);
    }

    // finish captureTreasure need to setup four elements for tiles
    /**
     public void captureTreasure(int tile){
     if(check if move is illegal){
     return false;
     }
     else if(treasureCount == 4){
    //remove all 4 treasure cards from player's deck
    //move treasure to display on layout
     treasureCount++;
     return true;
     }
     }*/
}
