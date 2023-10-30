package edu.up.cs301.tictactoe;

import edu.up.cs301.tictactoe.infoMessage.FiGameState;
import edu.up.cs301.tictactoe.players.HumanPlayer;
import edu.up.cs301.tictactoe.Tile;

public class moves {

    // instance variables


    // other class variables
    Tile[] board;
    private HumanPlayer humanPlayer; // player reference

    FiGameState firstInstance = new FiGameState();

    /** game actions will probably make a new class for these moves */
    public boolean move(int tile){
        // check if tile is empty
        if(board[tile].getValue() == Tile.Value.EMPTY){
            return true;
            humanPlayer.getPlayerId();
        }
        else
            return false;
    }
}
    public boolean shoreUp(int tile){
        // if tile level is less than 5
        if(board[tile].getLevel()){
            return false;
        }
        else if(actionsRemaining < 1){
            break;
            return true;
        }
    }
    // need to set up another player
    /**
     public boolean giveCard(int player){
     if(check if move is illegal){
     return false;
     }
     else{
     //choose card from array, remove, and add to another player's hand array'
     return true;
     }
     }
     */
    // finish captureTreasure need to setup four elements for tiles
    /**
     public void captureTreasure(int tile){
     if(check if move is illegal){
     return false;
     }
     else if(treasureCount == 4){
     //remove all 4 treasure cards from player's deck
     //move treasure to display on layout
     treasureCount++;
     return true;
     }
     }
     */

    public boolean drawTreasure(playerTurn){
        if(){
            return false;
        }
        else{
            //hand.add(); add treasure card to array of your deck
            return true;
        }
    }
    public boolean drawFlood(){
        if(check if move is illegal){
            return false;
        }
        else{
            //hand.add() add flood card to array of your deck hand
            return true;
        }
    } // end of moves

}
