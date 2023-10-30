package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Hashtable;

import edu.up.cs301.tictactoe.Tile;

public class GameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState {

    /** MOVE TO NEW CLASS? For card distrbt. */
    //arraylist to keep track of cards in hand
    ArrayList<Integer> hand = new ArrayList<Integer>();
    //possible treasure cards
    final int earthStone = 25;
    final int fireCrystal = 26;
    final int windStatue = 27;
    final int oceanChalice = 28;
    final int sandbag = 29;
    final int helicopterPad = 30;
    final int watersRise = 31;

    //instance variables
     Tile[] board;
    //hashtable that holds tile name and tile state
    //Hashtable<Integer, Integer>();

    Color playerPawn;
    int playerTurn;
    int floodMeter; // delete
    int actionsRemaining;
    int actionChoices;

    //variable for the state of tiles; 1-good, 2-flooded, 3-sunk
    int tileState;
    int treasureCount;
    int numEarthStoneCards;
    int numFireCrystalCards;
    int numWindStatueCards;
    int numOceanChaliceCards;

    //tile names for board and possible flood cards

    /** Default constructor for the game state */
    public GameState(){
        playerTurn = 1 // sets player 1 as start of game;
        actionsRemaining = 3;
        tileState = 1;
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
    public GameState(GameState other){
        playerTurn = other.playerTurn;
        floodMeter = other.floodMeter;
        actionsRemaining = other.actionsRemaining;
        tileState = other.tileState;
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

    /** game actions */
    public int move(int tile){
        // check if tile is empty
        if(board[i].getValue() == Tile.Value.EMPTY){
            return true;
        }
        else
            return false;
        }
    }
    public void shoreUp(int tile){
        // if tile level is less than 5
        if(board[i].getLevel()){
            return false;
        }
        else if(actionsRemaining < 1){
            break;
            return true;
        }
    }
    public void giveCard(int player){
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
     */

    public boolean drawTreasure(playerTurn){
        if(check if move is illegal){
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

    /**
     * Turns all board data into one long string
     * @return The appended string
     */
    @Override
    public String toString(){

        String result = "Player's Turn: ";
        if ([playerTurn] == 1) {
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
                " Tile State = "+tileState+
                " Treasure Count = "+treasureCount+
                " Earth Stone Cards = "+numEarthStoneCards+
                " Fire Crystal Cards = "+numFireCrystalCards+
                " Wind Statue Cards = "+numWindStatueCards+
                " Ocean Chalice Cards = "+numOceanChaliceCards+
                " Action Choices = "+actionChoices;


    }


}