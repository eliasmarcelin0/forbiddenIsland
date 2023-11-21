package edu.up.cs301.tictactoe.animation;

import android.content.Context;
import android.widget.Button;

//finds coordinates of the buttons
public class FIButton extends Button{
    int x;
    int y;
    public FIButton(Context context) {
        super(context);
    }
    /*give all the buttons coordinates so that in our action methods we can use the coordinates to
    know where to move the pawn when we call the move method or so we know which button to flip over
    when they want to shore up a tile*/
}
