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

    private int actionsRemaining;

    /** game actions will probably make a new class for these moves */
    public boolean move(int tile, FiGameState gamestate){//takes tile to move to
        // check if tile is empty, if shore is up, and if actions are remaining
        actionsRemaining = gamestate.getActionsRemaining();
        if((board[tile].getValue() == Tile.Value.EMPTY) && (actionsRemaining > 0) && board[tile].getLevel() <= 0 ) {
            // set Tile Equal to Full
            board[tile].setValue(Tile.Value.FULL);
            // Subtract actions remaining
            gamestate.setActionsRemaining(actionsRemaining--);
            return true;
        }
        return false;
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
