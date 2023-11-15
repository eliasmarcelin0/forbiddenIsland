package edu.up.cs301.tictactoe.players;

import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.game.GameFramework.players.GameComputerPlayer;

public class StupidComputer extends GameComputerPlayer {

    private GameState gameState;

    /**
     * constructor
     *
     * @param name the player's name (e.g., "John")
     */
    public StupidComputer(String name) {
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        gameState = (GameState) info;

    }
}
