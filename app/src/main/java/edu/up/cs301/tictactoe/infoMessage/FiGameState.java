package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import edu.up.cs301.tictactoe.Tile;
import edu.up.cs301.tictactoe.players.HumanPlayer;

public class FiGameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState implements View.OnClickListener {

    //instance variables  need to go over if we need all of them
    Color playerPawn;
    int playerTurn;

    private int playerId; // to use for moves
    int floodMeter;
    int actionsRemaining;
    int actionChoices;

    int treasureCount;
    int numEarthStoneCards;
    int numFireCrystalCards;
    int numWindStatueCards;
    int numOceanChaliceCards;

    // other class variables
    Tile[] board;
    private HumanPlayer humanPlayer; // player reference

    /** Default constructor for the game state */
    public FiGameState(){
        playerTurn = 1; // sets player 1 as start of game;
        playerId = 0;
        actionsRemaining = 3;
        treasureCount = 0;
        numEarthStoneCards = 0;
        numFireCrystalCards = 0;
        numWindStatueCards = 0;
        numOceanChaliceCards = 0;
        actionChoices = 1;
        Pawn p1 = new Pawn();

        board = new Tile[24]; // Initialize board with all 24 places

        for (int i = 0; i < 24; i++) {
            board[i] = new Tile(Tile.TileName.values()[i]); // assign places to values
        }

    }

    /** Copy Constructor */
    public FiGameState(FiGameState other){
        this.playerTurn = other.playerTurn;
        this.playerId = other.playerId;
        this.floodMeter = other.floodMeter;
        this.actionsRemaining = other.actionsRemaining;
        this.treasureCount = other.treasureCount;
        this.numEarthStoneCards = other.numEarthStoneCards;
        this.numFireCrystalCards = other.numFireCrystalCards;
        this.numWindStatueCards = other.numWindStatueCards;
        this.numOceanChaliceCards = other.numOceanChaliceCards;
        this.actionChoices = other.actionChoices;
        this.p1 = other.p1;

        board = new Tile[24];
        for (int i = 0; i < 24; i++) {
                board[i] = other.board[i];
        }
    }

    /** changeTurn */
    public void changeTurn() {
        // if playerTurn and then increment player turn
        if (playerTurn == humanPlayer.getPlayerId()) {

        }

    }


    /**
     * Turns all board data into one long string
     * @return The appended string
     */
    @Override
    public String toString(){

        String result = "Player's Turn: ";
        if (playerTurn == 1) {
            result += "Player 1's Turn";
        } else if (playerTurn == 2) {
            result += "Player 2's Turn";

        }
        //else if (playerTurn == 3) {
            //result += "Player 3's Turn";
        //}
        //else {
            //result += "Player 4's Turn";
        //}
        //result += "\n ";

        for (int i = 0; i < 24; i++) {
            String board1 = "";
            switch (board[i].getValue()) {
                case EMPTY: {
                    board1 = "Tile: Empty";
                    break;
                }
                case FLOODED: {
                    board1 = "Full";
                    break;
                }
                case SUNK: {
                    board1 = "Flooded";
                    break;
                }
            }
            result += " " + board1;
        }


        return "Turn = "+playerTurn+
                " Flood = "+floodMeter+
                " Remaining Actions = "+actionsRemaining+
                " Treasure Count = "+treasureCount+
                " Earth Stone Cards = "+numEarthStoneCards+
                " Fire Crystal Cards = "+numFireCrystalCards+
                " Wind Statue Cards = "+numWindStatueCards+
                " Ocean Chalice Cards = "+numOceanChaliceCards+
                " Action Choices = "+actionChoices;


    }
    public void onClick(View view) {

    }

    FiGameState firstInstance = new FiGameState();

    //setter method
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public void setFloodMeter(int floodMeter) {
        this.floodMeter = floodMeter;
    }

    public boolean shoreUp(int tile){
        // if tile level is less than 5 or no actions
        if( board[tile].getLevel() >= 5 || actionsRemaining <= 0){
            return false;
        }
        else {
            board[tile].setLevel( board[tile].getLevel() + 1 );
            return true;
        }
    }

    // need to set up another player
    /** UNCOMMENT AND FIX LATER ===========================================
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
     ======================== UNCOMMENT AND FIX LATER    */


    public boolean drawTreasure() {

        // if player has 5 cards or max amount of this card distrbt.
        if(humanPlayer.getNumberOfCardsInHand() >= 5){
            return false;
        }

        else{
            //hand.add(); add treasure card to array of your deck
            humanPlayer.addCardToHand(1);
            return true;
        }
    }
    public boolean drawFlood(){
        if(humanPlayer.getNumberOfCardsInHand() >= 5){
            return false;
        }
        else{
            //hand.add() add flood card to array of your deck hand
            humanPlayer.addCardToHand(2);
            return true;
        }
    } // end of moves


}