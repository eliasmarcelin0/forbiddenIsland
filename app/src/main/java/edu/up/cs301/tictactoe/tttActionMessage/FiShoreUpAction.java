package edu.up.cs301.tictactoe.tttActionMessage;

import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;

// other class variables
//Tile[] board;
//private HumanPlayer humanPlayer; // player reference

public class FiShoreUpAction extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public FiShoreUpAction(GamePlayer player) {
        super(player);
    }

    /*public boolean shoreUp(int tile){
        // if tile level is less than 5
        if(board[tile].getLevel()){
            return false;
        }
        else if(actionsRemaining < 1){
            return true;
        }
    }
    // need to set up another player
    public boolean giveCard(int player){
        if(check if move is illegal){
            return false;
        }
     else{

            //choose card from array, remove, and add to another player's hand array'
            return true;
        }
    }*/
}
