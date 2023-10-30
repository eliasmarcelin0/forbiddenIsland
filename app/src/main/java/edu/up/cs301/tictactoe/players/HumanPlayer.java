package edu.up.cs301.tictactoe.players;

import android.view.View;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.players.GameHumanPlayer;
import edu.up.cs301.tictactoe.infoMessage.GameState;

import android.widget.EditText;


public class HumanPlayer extends GameHumanPlayer implements View.OnClickListener {
    /**
     * constructor
     *
     * @param name the name of the player
     */
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public View getTopView() {
        return null;
    }

    @Override
    public void receiveInfo(GameInfo info) {

    }

    @Override
    public void setAsGui(GameMainActivity activity) {

    }
/*
    @Override
    public void onClick(View view) {
        //clear text from multiline edit text
        GameState firstInstance = new GameState();
        GameState secondInstance = new = GameState(firstInstance);
        firstInstance.move();
        //multiline edit text about move
        //(e.g., “Player 1 has moved his pawn from position 10 to position 14.”
        //edit text = edit text + ;
        firstInstance.shoreUp();
        //edit text = edit text + ;
        firstInstance.captureTreasure();
        //edit text = edit text + ;
        firstInstance.giveCard();
        //edit text = edit text + ;
        firstInstance.drawTreasure();
        //edit text = edit text + ;
        firstInstance.drawFlood();
        //edit text = edit text + ;
        GameState thirdInstance = new GameState();
        GameState fourthInstance = new GameState();
        fourthInstance = GameState(thirdInstance);
        toString(thirdInstance);
        toString(fourthInstance);
        //edit text = edit text + ;
    }*/
}
