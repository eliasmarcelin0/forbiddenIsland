package edu.up.cs301.tictactoe.tttActionMessage;

import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;

// other class variables
//Tile[] board;
//private HumanPlayer humanPlayer; // player reference
public class FiDrawTreasureAction extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public FiDrawTreasureAction(GamePlayer player) {
        super(player);
    }

    public boolean drawTreasure(playerTurn){
        if(){
            return false;
        }
        else{
            //hand.add(); add treasure card to array of your deck
            return true;
        }
    }
}
