package edu.up.cs301.tictactoe;

public class Tile {

    // Instance Variables //
    private TileName tileName;
    private Value value;
    private int level;


    /** Tile Cst */
    public Tile(TileName tileName) {
        this.value = Value.EMPTY;
        this.tileName = tileName;
        this.level = 0;
    }

    // set Tile value
    public enum Value {
        EMPTY,
        FULL,
    }//Value

    public enum Water {
        FLOODED,
        SUNK,
    }

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
        setLevel(0);

    }//revertTile



    ////////////////////////////
    // --- GETTER METHODS --- //
    ////////////////////////////
    public Value getValue() {return value;}//getValue
    public int getLevel() {return level;} //get Tile Level
    public TileName getTileName() {return tileName;}//getTilename


    ////////////////////////////
    // --- SETTER METHODS --- //
    ////////////////////////////


    public void setValue(Value value) {this.value = value;} //set Tile Value
    public void setLevel(int level) {this.level = level;} //set Tile Level
    public void setTileName(TileName tileName) {this.tileName = tileName;} //set Tile Name



}//Tile
