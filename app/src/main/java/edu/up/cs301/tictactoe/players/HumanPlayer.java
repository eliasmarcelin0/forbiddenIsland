package edu.up.cs301.tictactoe.players;

//import static edu.up.cs301.game.GameFramework.utilities.Logger.context;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.players.GameHumanPlayer;

import java.util.List;


public class HumanPlayer extends GameHumanPlayer implements View.OnClickListener {

    // instance variables
    private List<Integer> hand; //arraylist to keep track of cards in hand
    private int actionsRemaining; // player gets 3 moves

    /**
     * constructor
     *
     * @param name the name of the player
     */
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public View getTopView() {
        return null;
    }

    @Override
    public void receiveInfo(GameInfo info) {

    }

    @Override
    public void setAsGui(GameMainActivity activity) {

    }

    /** Editing Player Hand */
    public int getNumberOfCardsInHand() {
        return hand.size();
    }

    public void addCardToHand(int card) {
        hand.add(card);
    }

    public void removeCardFromHand(int card) {
        hand.remove(Integer.valueOf(card)); // Remove by card ID
    }

    @Override
    public void onClick(View view) {
        //clear text from multiline edit text
        Button RunTest = new Button();
        //editText.setText("big_text_description_here");
    }


    /** SETTER METHODS */

    public void setActionsRemaining(int actionsRemaining) {
        this.actionsRemaining = actionsRemaining;
    }

    /** GETTER METHODS */
    public int getActionsRemaining() {return this.actionsRemaining;}


}
