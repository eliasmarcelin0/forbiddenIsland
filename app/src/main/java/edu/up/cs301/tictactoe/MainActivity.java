package edu.up.cs301.tictactoe;

import android.os.Bundle;
import android.widget.EditText;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.game.R;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;


public class MainActivity extends GameMainActivity {
    //create an edit text
    public EditText multiLineEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_config_main);
        multiLineEditText = findViewById(R.id.multiLineEditText);
    }

    @Override
    public EditText performGameActivity() {
        multiLineEditText = HumanPlayer.getMultiLineEditText();

        //creating an instance and a copy of that instance
        FiGameState firstInstance = new FiGameState();
        FiGameState secondInstance = new FiGameState(firstInstance);

        //calling all the action methods on the firstInstance and printing what they did
        firstInstance.move(5);
        multiLineEditText.append("Player one has moved");

        firstInstance.shoreUp(4);
        multiLineEditText.append("Player one shored up");

        //firstInstance.captureTreasure();
        multiLineEditText.append("Player one capture a treasure");

        //firstInstance.giveCard();
        multiLineEditText.append("Player one gave a card away");

        firstInstance.drawTreasure();
        multiLineEditText.append("Player one drew a treasure card");

        firstInstance.drawFlood();
        multiLineEditText.append("Player one drew a flood card");

        //creating a third instance and a copy of that instance
        FiGameState thirdInstance = new FiGameState();
        FiGameState fourthInstance = new FiGameState(thirdInstance);

        //calling the toString method on both instances to check they are the same
        thirdInstance.toString();
        fourthInstance.toString();
        return multiLineEditText;
    }

    @Override
    public GameConfig createDefaultConfig() {
        return null;
    }

    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }


}
