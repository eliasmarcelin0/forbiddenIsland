package edu.up.cs301.tictactoe.players;

import static edu.up.cs301.game.GameFramework.utilities.Logger.context;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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

    @Override
    public void onClick(View view) {
        //clear text from multiline edit text
        Button RunTest = new Button();
        //editText.setText("big_text_description_here");

        //creating an instance and a copy of that instance
        GameState firstInstance = new GameState();
        GameState secondInstance = new GameState(firstInstance);

        //calling all the action methods on the firstInstance and printing what they did
        firstInstance.move(5);
        //multiline edit text about move
        //edit text = edit text + ;
        System.out.print("Player one moved");

        firstInstance.shoreUp();
        //edit text = edit text + ;
        System.out.print("Player one shored up");

        //firstInstance.captureTreasure();
        //edit text = edit text + ;
        //System.out.print("Player one capture a treasure");

        firstInstance.giveCard();
        //edit text = edit text + ;
        System.out.print("Player one gave a card away");

        firstInstance.drawTreasure();
        //edit text = edit text + ;
        System.out.print("Player one drew a treasure card");

        firstInstance.drawFlood();
        //edit text = edit text + ;
        System.out.print("Player one drew a flood card");

        //creating a third instance and a copy of that instance
        GameState thirdInstance = new GameState();
        GameState fourthInstance = new GameState(thirdInstance);

        //calling the toString method on both instances to check they are the same
        thirdInstance.toString();
        fourthInstance.toString();
    }
}
