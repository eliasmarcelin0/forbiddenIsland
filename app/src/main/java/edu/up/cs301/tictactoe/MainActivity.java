package edu.up.cs301.tictactoe;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;


public class MainActivity extends GameMainActivity {
    @Override
    public GameConfig createDefaultConfig() {
        //creating an instance and a copy of that instance
        FiGameState firstInstance = new FiGameState();
        FiGameState secondInstance = new FiGameState(firstInstance);

        //calling all the action methods on the firstInstance and printing what they did

        //multiline edit text about move
        //edit text = edit text + ;
        if (firstInstance.move(5) == true) {
            System.out.print("Player one moved");
        }
        else {

        }


        firstInstance.shoreUp(4);
        //edit text = edit text + ;
        System.out.print("Player one shored up");

        //firstInstance.captureTreasure();
        //edit text = edit text + ;
        //System.out.print("Player one capture a treasure");

        //firstInstance.giveCard();
        //edit text = edit text + ;
        //System.out.print("Player one gave a card away");

        firstInstance.drawTreasure();
        //edit text = edit text + ;
        System.out.print("Player one drew a treasure card");

        firstInstance.drawFlood();
        //edit text = edit text + ;
        System.out.print("Player one drew a flood card");

        //creating a third instance and a copy of that instance
        FiGameState thirdInstance = new FiGameState();
        FiGameState fourthInstance = new FiGameState(thirdInstance);

        //calling the toString method on both instances to check they are the same
        thirdInstance.toString();
        fourthInstance.toString();
    }

    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }


}
