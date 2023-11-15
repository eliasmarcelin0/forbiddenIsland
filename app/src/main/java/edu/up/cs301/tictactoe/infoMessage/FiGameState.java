package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;

import edu.up.cs301.tictactoe.Tile;
import edu.up.cs301.tictactoe.players.HumanPlayer;

public class FiGameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState {

    //instance variables  need to go over if we need all of them
    Color playerPawn;
    int playerTurn;

    int playerId; // to use for moves
    int floodMeter; // delete
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

        board = new Tile[24]; // Initialize board with all 24 places

        for (int i = 0; i < 24; i++) {
            board[i] = new Tile(Tile.TileName.values()[i]); // assign places to values
        }

    }

    /** Copy Constructor */
    public FiGameState(FiGameState other){
        playerTurn = other.playerTurn;
        playerId = other.playerId;
        floodMeter = other.floodMeter;
        actionsRemaining = other.actionsRemaining;
        treasureCount = other.treasureCount;
        numEarthStoneCards = other.numEarthStoneCards;
        numFireCrystalCards = other.numFireCrystalCards;
        numWindStatueCards = other.numWindStatueCards;
        numOceanChaliceCards = other.numOceanChaliceCards;
        actionChoices = other.actionChoices;

        board = new Tile[24];
        for (int i = 0; i < 24; i++) {
                board[i] = other.board[i];
        }
    }

    /** changeTurn */
    public void changeTurn() {
        // if playerTurn and then increment player turn
        if (playerTurn == humanPlayer.getPlayerId()) {}

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
        else if (playerTurn == 3) {
            result += "Player 3's Turn";
        }
        else {
            result += "Player 4's Turn";
        }
        result += "\n ";

        for (int i = 0; i < 24; i++) {
            String board1 = "";
            switch (board[i].getValue()) {
                case EMPTY: {
                    board1 = "Tile: Empty";
                    break;
                }
                case FULL: {
                    board1 = "Full";
                    break;
                }
                case FLOODED: {
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

    FiGameState firstInstance = new FiGameState();

    //setter method
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    //getter method
    public int getPlayerId() {return this.playerId;}
}