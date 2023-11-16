package edu.up.cs301.tictactoe.players;

import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.infoMessage.GameState;
import edu.up.cs301.game.GameFramework.players.GameComputerPlayer;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;
import edu.up.cs301.tictactoe.tttActionMessage.TTTMoveAction;

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
        if(info instanceof FiGameState) {
            FiGameState gameState = (FiGameState) info;
            if(this.playerNum == gameState.getPlayerId()){
                game.sendAction(gameState.drawTreasure());
                int randomNum = (int) (Math.random() * 4);
                if(randomNum == 0){
                    game.sendAction(gameState.move());
                    game.sendAction(new TTTMoveAction(this, 1, 1));
                }
                else if(randomNum == 1){
                    game.sendAction(gameState.shoreUp());
                }
                else if(randomNum == 2){
                    game.sendAction(gameState.captureTreasure());
                }
                else {
                    game.sendAction(gameState.giveCard());
                }
                game.sendAction(gameState.drawFlood());
            }
        }
    }
}
