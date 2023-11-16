package edu.up.cs301.tictactoe.tttActionMessage;

import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;

// other class variables
 //Tile[] board;
 //private HumanPlayer humanPlayer; // player reference

public class FiMoveAction extends GameAction{
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public FiMoveAction(GamePlayer player) {
        super(player);
    }

    /*public boolean move(int tile, FiGameState gamestate){
        // check if tile is empty
        if(board[tile].getTileName() != board[tile].getTileName())
        {
            if(board[tile].getTileName() = board[tile].(above))
            {
                pawn = board[tile].(above);
                return true;
            }
            if(board[tile].getTileName() = board[tile].(below))
            {
                pawn = board[tile].(below);
                return true;
            }

        }
        else
            return false;
    }*/
}
