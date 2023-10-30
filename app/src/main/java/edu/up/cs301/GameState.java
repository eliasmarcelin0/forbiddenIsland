package edu.up.cs301;
import android.graphics.Color;

import java.util.ArrayList;

public class GameState extends edu.up.cs301.game.GameFramework.infoMessage.GameState {
    Color playerPawn;
    boolean yourTurn;
    //private gameStage;
    int floodMeter;
    //private discardFlood;
    //private discardTreasure;

    //ArrayList<> hand;

    final int move = 1;
    final int shoreUp = 2;
    final int giveCard = 3;
    final int captureTreasure = 4;
    final int drawTreasure = 5;
    final int drawFlood = 6;

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
}