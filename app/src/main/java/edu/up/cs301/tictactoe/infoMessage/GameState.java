package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Hashtable;

public class GameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState {
    //possible actions on turn for actionChoices
    final int drawTreasure = 1;
    final int move = 2;
    final int shoreUp = 3;
    final int giveCard = 4;
    final int captureTreasure = 5;
    final int drawFlood = 6;

    //arraylist to keep track of cards in hand
    ArrayList<Integer> hand = new ArrayList<Integer>();

    //tile names for board and possible flood cards
    final int FoolsLandingTile = 1;
    final int BronzeGateTile = 2;
    final int GoldGateTile = 3;
    final int CoralPalaceTile = 4;
    final int SunTempleTile = 5;
    final int SilverGateTile = 6;
    final int PhantomRockTile = 7;
    final int WatchtowerTile = 8;
    final int CopperGateTile = 9;
    final int AbandonedCliffsTile = 10;
    final int WhisperingGardensTile = 11;
    final int ShadowCaveTile = 12;
    final int LostLagoonTile = 13;
    final int MoonTempleTile = 14;
    final int DeceptionDunesTile = 15;
    final int TwilightHollowTile = 16;
    final int EmberCaveTile = 17;
    final int TidalPalaceTile = 18;
    final int ObservatoryTile = 19;
    final int IronGateTile = 20;
    final int CrimsonForestTile = 21;
    final int MistyMarshTile = 22;
    final int BreakersBridgeTile = 23;
    final int HowlingGardenTile = 24;

    //possible treasure cards
    final int earthStone = 25;
    final int fireCrystal = 26;
    final int windStatue = 27;
    final int oceanChalice = 28;
    final int sandbag = 29;
    final int helicopterPad = 30;
    final int watersRise = 31;

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

    //default constructor
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
    }

    //copy constructor
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
    }

    @Override
    public String toString(){
        return "Turn = "+yourTurn+
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


    //game actions
    /*
    public void move(){
        if(check if move is illegal){
            return false;
        }
        else if(OnClick() is adjacent){
            move to Onclick() position;
            return true;
        }
    }
    public void shoreUp(){
        if(check if move is illegal){
            return false;
        }
        else if(actionsRemaining < 1){
            break;
            return true;
        }
    }
    public void giveCard(){
        if(check if move is illegal){
            return false;
        }
        else{
            //choose card from array, remove, and add to another player's hand array'
            return true;
        }
    }
    public void captureTreasure(){
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
    public boolean drawTreasure(){
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
    }*/
}