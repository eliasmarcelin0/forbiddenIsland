package edu.up.cs301.tictactoe;

public class Tile {
    public enum Value {
        EMPTY,
        FULL,
        FLOODED,
    }//Value

    // Instance Variables //
    private Value value;

    private final int row;
    private final int col;

    public Tile(int row, int col) {
        this.value = Value.EMPTY;
        this.row = row;
        this.col = col;
    }//ctor

    /**
     * Reverts tile back to its "empty state"
     */
    public void revertTile() {
        setValue(Value.EMPTY);
        //setIsKing(false);
    }//revertTile

    ////////////////////////////
    // --- GETTER METHODS --- //
    ////////////////////////////
    public Value getValue() {return value;}//getValue
    public int getRow() {return row;}//getKing
    public int getCol() {return col;}//getCol

    ////////////////////////////
    // --- SETTER METHODS --- //
    ////////////////////////////
    public void setValue(Value value) {this.value = value;}//setInTile




}//Tile
