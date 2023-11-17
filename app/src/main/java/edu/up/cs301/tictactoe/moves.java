package edu.up.cs301.tictactoe;

import edu.up.cs301.game.GameFramework.players.GamePlayer;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;
import edu.up.cs301.tictactoe.players.HumanPlayer;
import edu.up.cs301.tictactoe.Tile;

public class moves extends FiGameState {

    // instance variables

    // other class variables
    Tile[] board;
    private HumanPlayer humanPlayer; // player reference


    /** game actions will probably make a new class for these moves */
    public boolean move(int tile, FiGameState gamestate){
        // check if tile is empty
        if(board[tile].getTileName() != board[tile].getTileName())
        {
            if(board[tile].getTileName() = board[tile].(above))
            {
                pawn = board[tile].(above);
                return true;
            }
            if(board[tile].getTileName() = board[tile].(below))
            {
                pawn = board[tile].(below);
                return true;
            }

        }
        else {
            return false;
        }
    }

    public boolean shoreUp(int tile) {
        // if the shoreup is 5 or greater return or no actions
        if (board[tile].getLevel() >= 5 || actionsRemaining < 1) {
            return false;
        } else {
            board[tile].setLevel(board[tile].getLevel() + 1);
            return true;
        }
    }
    // need to set up another player

        public boolean giveCard(int player){
     if("check if move is illegal" == "fix this"){ 
        return false;
     }
     else {
     //choose card from array, remove, and add to another player's hand array'
     return true;
        }
     }
     
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

    public boolean drawTreasure(){
        // if player has 5 cards or max amount of this card discard.
        if(humanPlayer.getNumberOfCardsInHand() >= 5){
            return false;
        }

        else{
            //hand.add(); add treasure card to array of your deck
            humanPlayer.addCardToHand(2);
            return true;
        }
    } // end of drawTreasure
    public boolean drawFlood(){
        if(humanPlayer.getNumberOfCardsInHand() >= 5){
            return false;
        }
        else{
            //hand.add() add flood card to array of your deck hand
            humanPlayer.addCardToHand(getFloodMeter());
            return true;
        }
    } // end of drawFlood

    public void FiCaptureTreasureAction(GamePlayer player) {

    }

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
     }*/

} // end of moves class
