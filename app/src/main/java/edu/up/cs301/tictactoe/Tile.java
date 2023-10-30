package edu.up.cs301.tictactoe;

public class Tile {

    // Instance Variables //
    private TileName tileName;
    private Value value;


    /** Tile Cst */
    public Tile(TileName tileName) {
        this.value = Value.EMPTY;
        this.tileName = tileName;
    }

    // set Tile value
    public enum Value {
        EMPTY,
        FULL,
        FLOODED,
    }//Value

    // Enum for the names of the tiles
    public enum TileName {
        FOOLS_LANDING,
        BRONZE_GATE,
        GOLD_GATE,
        CORAL_PALACE,
        SUN_TEMPLE,
        SILVER_GATE,
        PHANTOM_ROCK,
        WATCHTOWER,
        COPPER_GATE,
        ABANDONED_CLIFFS,
        WHISPERING_GARDENS,
        SHADOW_CAVE,
        LOST_LAGOON,
        MOON_TEMPLE,
        DECEPTION_DUNES,
        TWILIGHT_HOLLOW,
        EMBER_CAVE,
        TIDAL_PALACE,
        OBSERVATORY,
        IRON_GATE,
        CRIMSON_FOREST,
        MISTY_MARSH,
        BREAKERS_BRIDGE,
        HOWLING_GARDEN
    }


    /**
     * Reverts tile back to its "empty state"
     */
    public void revertTile() {
        setValue(Value.EMPTY);

    }//revertTile



    ////////////////////////////
    // --- GETTER METHODS --- //
    ////////////////////////////
    public Value getValue() {return value;}//getValue
    public TileName getTilename() {return tileName;}//getTilename


    ////////////////////////////
    // --- SETTER METHODS --- //
    ////////////////////////////
    public void setValue(Value value) {this.value = value;}//setInTile


}//Tile
