package edu.up.cs301.tictactoe.players;

import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.game.GameFramework.players.GameComputerPlayer;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;

public class SmartComputer extends GameComputerPlayer {
    /**
     * constructor
     *
     * @param name the player's name (e.g., "John")
     */
    public SmartComputer(String name) {
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        if(info instanceof FiGameState){
            FiGameState gameState = (FiGameState) info;
        }
    }
}
