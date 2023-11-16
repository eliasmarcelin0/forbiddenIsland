package edu.up.cs301.tictactoe;

import edu.up.cs301.game.GameFramework.players.GamePlayer;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;
import edu.up.cs301.tictactoe.players.HumanPlayer;
import edu.up.cs301.tictactoe.Tile;
import edu.up.cs301.game.GameFramework.actionMessage.GameAction;

public class moves extends FiGameState {

    // instance variables

    // other class variables
    Tile[] board;
    private int row;
    private int col;

 /*   public TTTMoveAction(GamePlayer player, int row, int col)
    {
        // invoke superclass constructor to set the player
        super(player);

        // set the row and column as passed to us
        this.row = Math.max(0, Math.min(2, row));
        this.col = Math.max(0, Math.min(2, col));
    }

    *//**
     * get the object's row
     *
     * @return the row selected
     *//*
    public int getRow() { return row; }

    *//**
     * get the object's column
     *
     * @return the column selected
     *//*
    public int getCol() { return col; }

}
*/


    /** game actions will probably make a new class for these moves */
    public boolean move(int tile, FiGameState gamestate, int row, int col){
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
            return true;
        }
    }
    // need to set up another player
     public boolean giveCard(int player){
     if(check if move is illegal){
     return false;
     }
     else{

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
        */
}
