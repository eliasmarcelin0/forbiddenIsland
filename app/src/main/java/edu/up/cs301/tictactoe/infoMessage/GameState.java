package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Hashtable;

import edu.up.cs301.tictactoe.Tile;

public class GameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState {

    /** delete and put into move class */
    //possible actions on turn for actionChoices
    final int drawTreasure = 1;
    final int move = 2;
    final int shoreUp = 3;
    final int giveCard = 4;
    final int captureTreasure = 5;
    final int drawFlood = 6;

    //possible treasure cards
    final int earthStone = 25;
    final int fireCrystal = 26;
    final int windStatue = 27;
    final int oceanChalice = 28;
    final int sandbag = 29;
    final int helicopterPad = 30;
    final int watersRise = 31;

    //arraylist to keep track of cards in hand
    ArrayList<Integer> hand = new ArrayList<Integer>();

    //instance variables
    private Tile[] board;

    //tile names for board and possible flood cards

    /** Default constructor for thed game state */
    public GameState(){
        yourTurn = true;
        floodMeter = 0;
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



    //hashtable that holds tile name and tile state
    //Hashtable<Integer, Integer>();

    Color playerPawn;
    boolean yourTurn;
    int floodMeter;
    int actionsRemaining;
    int actionChoices;
    //variable for the state of tiles; 1-good, 2-flooded, 3-sunk
    int tileState;
    int treasureCount;
    int numEarthStoneCards;
    int numFireCrystalCards;
    int numWindStatueCards;
    int numOceanChaliceCards;

    public GameState(GameState other){
        yourTurn = other.yourTurn;
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
}