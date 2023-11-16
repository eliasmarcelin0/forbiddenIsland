package edu.up.cs301.tictactoe;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.gameConfiguration.GameConfig;
import edu.up.cs301.game.GameFramework.gameConfiguration.GamePlayerType;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.game.GameFramework.players.GamePlayer;
import edu.up.cs301.game.R;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;
import edu.up.cs301.tictactoe.players.HumanPlayer;
import edu.up.cs301.tictactoe.players.StupidComputer;


public class MainActivity extends GameMainActivity {
    //The port number to be used IF network implementation is made
    private static final int PORT_NUMBER = 8080;


    /** I think you edit the multi text here? **/
    @Override
    public EditText performGameActivity() {
        return null;
    } // end of performGameActivity

    /**
     * Creates the default configuration of the game
     *
     * There are three types available: human, smart AI,
     * and base AI, where the default chooses to add
     * @return   The default configuration of the game
     */
    @Override
    public GameConfig createDefaultConfig() {
        //Define the allowed player types
        ArrayList<GamePlayerType> playerTypes = new ArrayList<>();

        //Adds the human and computer types
        playerTypes.add(new GamePlayerType("Local Human Player") {
            public GamePlayer createPlayer(String name) {
                return new HumanPlayer(name, R.layout.activity_main);
            }});
        playerTypes.add(new GamePlayerType("Smart AI Player") {
            public GamePlayer createPlayer(String name) {return new StupidComputer(name);}});
        playerTypes.add(new GamePlayerType("Base AI Player") {
            public GamePlayer createPlayer(String name) {return new StupidComputer(name);}});

        // Create a game configuration class for Forbideden Island:
        GameConfig defaultConfig = new GameConfig(playerTypes, 2, 2, "Forbidden Island", PORT_NUMBER);
        defaultConfig.addPlayer("Human", 0); // player 1: a human player
        defaultConfig.addPlayer("Computer", 1); // player 2: a computer player

        return defaultConfig;
    }//createDefaultConfig

    /** Create Local Game */
    // fix this below to make localGame
    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    } // end of LocalGame


} // end of main
