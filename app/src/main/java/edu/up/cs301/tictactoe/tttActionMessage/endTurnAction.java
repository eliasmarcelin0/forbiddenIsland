package edu.up.cs301.tictactoe.tttActionMessage;

import java.io.Serializable;

import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;

//let's the game know the player's turn is done
public class endTurnAction extends GameAction implements Serializable {
    //Tag for logging
    private static final String TAG = "EndTurnAction";

    //Long for network play - changed the number before the L to a 6 instead of a 7.
    private static final long serialVersionUID = 3067264564645016L;

    public endTurnAction(GamePlayer player){
        super(player);
    }

}
