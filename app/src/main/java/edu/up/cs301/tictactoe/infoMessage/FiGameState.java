package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import edu.up.cs301.tictactoe.Tile;
import edu.up.cs301.tictactoe.players.HumanPlayer;

public class FiGameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState implements View.OnClickListener {

    //instance variables need to go over if we need all of them
    Color playerPawn;
    int playerTurn;

    int playerId; // to use for moves
    int floodMeter;
    int actionsRemaining;
    int actionChoices;
    private ArrayList<Integer> treasureDeck;
    private ArrayList<Integer> discardTreasureDeck;
    private ArrayList<Integer> floodDeck;
    private ArrayList<Integer> discardFloodDeck;
    private ArrayList<Integer> humanPlayerHand;
    private ArrayList<Integer> dumbAiHand;
    private ArrayList<Integer> smartAiHand;
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

        board = new Tile[24];
        for (int i = 0; i < 24; i++) {
                board[i] = other.board[i];
        }
    }

    /** changeTurn */
    public void changeTurn(FiGameState fiGameState) {
        // if playerTurn and then increment player turn
        if (playerTurn == fiGameState.getPlayerId()) {
            if(playerTurn == 1)
            {
                playerTurn = 0;
            }
            if(playerTurn == 0)
            {
                playerTurn = 1;
            }
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
    FiGameState firstInstance = new FiGameState();
        if(getPlayerId() == 0)
        {
            FiGameState secondInstance = new FiGameState(firstInstance);
        }
        else
        {
            firstInstance = firstInstance;
        }
    }

    /**
     * Creates a new board and initializes the pieces of the board to the right spots
     */
    public void initBoard() {
        int i = 0;
        for (Tile.TileName tileName : Tile.TileName.values()) {
            //System.out.println(tileName);
            board[i] = new Tile(tileName);
            i++;

        }


        resetBoard();

    }//initBoard

    /**
     * --- HELPER METHOD ---
     * Empties out the board and puts each piece back to their "starting positions"
     */
    public void resetBoard() {

    }

    //setter methods
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public void setFloodMeter(int floodMeter) {
        this.floodMeter = floodMeter;
    }
    public void setPlayerTurn(int turn){
        this.playerTurn = turn;
    }
    public void setActionsRemaining(int remaining){
        this.actionsRemaining = remaining;
    }
    public void setTreasureCount(int count){
        this.treasureCount = count;
    }
    public void setNumEarthStoneCards(int earth){
        this.numEarthStoneCards = earth;
    }
    public void setNumFireCrystalCards(int fire){
        this.numFireCrystalCards = fire;
    }
    public void setNumWindStatueCards(int wind){
        this.numWindStatueCards = wind;
    }
    public void setNumOceanChaliceCards(int ocean){
        this.numOceanChaliceCards = ocean;
    }
    public void setActionChoices(int action){
        this.actionChoices = action;
    }

    //getter methods
    public int getPlayerId() {return this.playerId;}
    public int getFloodMeter() {return this.floodMeter;}
    public int getPlayerTurn() {return this.playerTurn;}
    public int getActionsRemaining(){
        return this.actionsRemaining;
    }
    public int getTreasureCount(){
        return this.treasureCount;
    }
    public int getNumEarthStoneCards(){
        return this.numEarthStoneCards;
    }
    public int getNumFireCrystalCards(){
        return this.numFireCrystalCards;
    }
    public int getNumWindStatueCards(){
        return this.numWindStatueCards;
    }
    public int getNumOceanChaliceCards(){
        return this.numOceanChaliceCards;
    }
    public int getActionChoices(){
        return this.actionChoices;
    }
    public Tile[] getBoard() {return board;}

}