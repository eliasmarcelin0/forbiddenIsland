package edu.up.cs301.tictactoe.infoMessage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Hashtable;

public class GameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState {
    //possible actions on turn
    final int move = 1;
    final int shoreUp = 2;
    final int giveCard = 3;
    final int captureTreasure = 4;
    final int drawTreasure = 5;
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
    //variable for the state of tiles; 1-good, 2-flooded, 3-sunk
    int tileState;


    public GameState(){
        yourTurn = true;
        floodMeter = 0;
        actionsRemaining = 3;
        tileState = 1;
    }
}