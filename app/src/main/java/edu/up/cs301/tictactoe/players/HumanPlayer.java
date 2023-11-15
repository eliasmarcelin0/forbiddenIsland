package edu.up.cs301.tictactoe.players;

//import static edu.up.cs301.game.GameFramework.utilities.Logger.context;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.up.cs301.game.GameFramework.GameMainActivity;
import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.infoMessage.GameInfo;
import edu.up.cs301.game.GameFramework.players.GameHumanPlayer;
import edu.up.cs301.game.R;
import edu.up.cs301.tictactoe.infoMessage.FiGameState;

import java.util.List;


public class HumanPlayer extends GameHumanPlayer implements View.OnClickListener, View.OnTouchListener {

    // instance variables
    private List<Integer> hand; //arraylist to keep track of cards in hand
    private int actionsRemaining; // player gets 3 moves

    private Button quitButton = null;
    private Button deckButton = null;
    private Button FOOLS_LANDING = null;
    private Button button23 = null;
    private Button button24 = null;
    private Button button25 = null;
    private Button button26 = null;
    private Button button27 = null;
    private Button button28 = null;
    private Button button29 = null;
    private Button button30 = null;
    private Button button31 = null;
    private Button button32 = null;
    private Button button33 = null;
    private Button button34 = null;
    private Button button35 = null;
    private Button button36 = null;
    private Button button37 = null;
    private Button button38 = null;
    private Button button39 = null;
    private Button button40 = null;
    private Button button41 = null;
    private Button button42 = null;
    private Button button43 = null;
    private Button button44 = null;
    private Button button45 = null;
    private Button button16 = null;
    private Button button17 = null;
    private Button button4 = null;
    private Button button3 = null;
    private Button button5 = null;
    private Button captureTreasureButton = null;
    
    private GameMainActivity myActivity;

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
        return myActivity.findViewById(R.id.top_gui_layout);
    }

    @Override
    public void receiveInfo(GameInfo info) {
        if(info instanceof FiGameState){
            FiGameState gameState = (FiGameState) info;
        }
    }

    @Override
    public void setAsGui(GameMainActivity activity) {
        //remember the activity
        myActivity = activity;

        //layout resource for gui
        activity.setContentView(R.layout.fi_game_ui);

        //initialize the widget member variables
        this.quitButton = (Button)activity.findViewById(R.id.quitButton);
        this.deckButton = (Button)activity.findViewById(R.id.deckButton);
        this.button22 = (Button)activity.findViewById(R.id.FOOLS_LANDING);
        this.button23 = (Button)activity.findViewById(R.id.button23);
        this.button24 = (Button)activity.findViewById(R.id.button24);
        this.button25 = (Button)activity.findViewById(R.id.button25);
        this.button26 = (Button)activity.findViewById(R.id.button26);
        this.button27 = (Button)activity.findViewById(R.id.button27);
        this.button28 = (Button)activity.findViewById(R.id.button28);
        this.button29 = (Button)activity.findViewById(R.id.button29);
        this.button30 = (Button)activity.findViewById(R.id.button30);
        this.button31 = (Button)activity.findViewById(R.id.button31);
        this.button32 = (Button)activity.findViewById(R.id.button32);
        this.button33 = (Button)activity.findViewById(R.id.button33);
        this.button34 = (Button)activity.findViewById(R.id.button34);
        this.button35 = (Button)activity.findViewById(R.id.button35);
        this.button36 = (Button)activity.findViewById(R.id.button36);
        this.button37 = (Button)activity.findViewById(R.id.button37);
        this.button38 = (Button)activity.findViewById(R.id.button38);
        this.button39 = (Button)activity.findViewById(R.id.button39);
        this.button40 = (Button)activity.findViewById(R.id.button40);
        this.button41 = (Button)activity.findViewById(R.id.button41);
        this.button42 = (Button)activity.findViewById(R.id.button42);
        this.button43 = (Button)activity.findViewById(R.id.button43);
        this.button44 = (Button)activity.findViewById(R.id.button44);
        this.button45 = (Button)activity.findViewById(R.id.button45);
        this.button16 = (Button)activity.findViewById(R.id.button16);
        this.button17 = (Button)activity.findViewById(R.id.button17);
        this.button4 = (Button)activity.findViewById(R.id.button4);
        this.button3 = (Button)activity.findViewById(R.id.button3);
        this.button5 = (Button)activity.findViewById(R.id.button5);
        this.captureTreasureButton = (Button)activity.findViewById(R.id.captureTreasureButton);

        //if a button is pressed call the onClickListener method
        quitButton.setOnClickListener(this);
        deckButton.setOnClickListener(this);
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
    public void onClick(View button) {
        if(button.getId() == R.id.quitButton){
            game.sendAction();
        }
        else if(button.getId() == R.id.deckButton){
            game.sendAction(hand.drawTreasure(this));
        }
        else if(button.getId() == R.id.shoreUpButton){
            game.sendAction(FiGameState.shoreUp(FOOLS_LANDING));
        }
    }


    /** SETTER METHODS */

    public void setActionsRemaining(int actionsRemaining) {
        this.actionsRemaining = actionsRemaining;
    }

    /** GETTER METHODS */
    public int getActionsRemaining() {return this.actionsRemaining;}


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
