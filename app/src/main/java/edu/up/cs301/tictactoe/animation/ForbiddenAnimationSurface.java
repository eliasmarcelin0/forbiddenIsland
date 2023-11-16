package edu.up.cs301.tictactoe.animation;

/*
 * An extension of SurfaceView taken from GameFramework's
 * "AnimationSurface" class to animate each piece's movement
 *
 * @author   Elias Marcelino
 * @author   Keeley
 * @author   Olivia
 * @author   De'ante
 * @version  March 2023
 */

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;

import edu.up.cs301.game.GameFramework.animation.AnimationSurface;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;
//import edu.up.cs301.tictactoe.R;
import edu.up.cs301.tictactoe.Tile;

public class ForbiddenAnimationSurface extends AnimationSurface {
    /* --- INSTANCE VARIABLES --- */
    protected FiGameState fiGameState;


    /* --- Colors --- */
    public int foregroundColor() {return Color.YELLOW;}//foregroundColor
    public int backgroundColor() {return Color.BLUE;}//backgroundColor
    public int whiteTile() {return Color.WHITE;}//whiteTile
    public int blackTile() {return Color.BLACK;}//blackTile
    public int lightPiece() {return Color.RED;}//lightPiece
    public int darkPiece() {return Color.GRAY;}//darkPiece
    public int availPiece() {return Color.GREEN;}//availPiece
    public int startPiece() {return Color.rgb(0, 255, 255);}//startPiece


    /**
     * The inherited constructor from AnimationSurface class
     *
     * @param context The activity the animation is run on
     */
    public ForbiddenAnimationSurface(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }//ctor

    /**
     * --- HELPER METHOD (for ctor) ---
     */
    private void init() {
        setBackgroundColor(backgroundColor());
    }//init

    /**
     * Called when a change is made so that the board itself
     * can be updated
     *
     * @param g   The canvas we are drawing on
     */
    public void onDraw(Canvas g) {
        //getDimensions(g);
        Paint p = new Paint();

        //The trim around the board
        p.setColor(foregroundColor());
        g.drawRect(5,5,5,5, p);
        //White Base
        p.setColor(whiteTile());
        //g.drawRect()

        //Black Tiles
        p.setColor(blackTile());
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row % 2 != 0 && col % 2 == 0) || (row % 2 == 0 && col % 2 != 0)) {
                    //g.drawRect()
                }
            }
        }

        // If we don't have any state, there's nothing more to draw, so return
        if (fiGameState == null) {
            return;
        }

        /**
        // Draws the different types of pieces (either black, red, empty, or available)
        Tile[][] temp = FiGameState.getBoard();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                drawSymbol(g, temp[row][col]);
            }
        }
        */
    }//onDraw





} // end of class