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
    private Button drawTreasureButton = null;
    private Button drawFloodButton = null;
    private Button moveButton = null;
    private Button shoreUpButton = null;
    private Button discardButton = null;
    private Button captureTreasureButton = null;
    private Button FOOLS_LANDING = null;
    private Button BRONZE_GATE = null;
    private Button GOLD_GATE = null;
    private Button CORAL_PALACE = null;
    private Button SUN_TEMPLE = null;
    private Button SILVER_GATE = null;
    private Button PHANTOM_ROCK = null;
    private Button WATCHTOWER = null;
    private Button COPPER_GATE = null;
    private Button ABANDONED_CLIFFS = null;
    private Button WHISPERING_GARDENS = null;
    private Button SHADOW_CAVE = null;
    private Button LOST_LAGOON = null;
    private Button MOON_TEMPLE = null;
    private Button DECEPTION_DUNES = null;
    private Button TWILIGHT_HOLLOW = null;
    private Button EMBER_CAVE = null;
    private Button TIDAL_PALACE = null;
    private Button OBSERVATORY = null;
    private Button IRON_GATE = null;
    private Button CRIMSON_FOREST = null;
    private Button MISTY_MARSH = null;
    private Button BREAKERS_BRIDGE = null;
    private Button HOWLING_GARDEN = null;
    
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

        //intializing action buttons
        this.quitButton = (Button)activity.findViewById(R.id.quitButton);
        this.deckButton = (Button)activity.findViewById(R.id.deckButton);
        this.drawTreasureButton = (Button)activity.findViewById(R.id.drawTreasureButton);
        this.drawFloodButton = (Button)activity.findViewById(R.id.drawFloodButton);
        this.moveButton = (Button)activity.findViewById(R.id.moveButton);
        this.shoreUpButton = (Button)activity.findViewById(R.id.shoreUpButton);
        this.discardButton = (Button)activity.findViewById(R.id.discardButton);
        this.captureTreasureButton = (Button)activity.findViewById(R.id.captureTreasureButton);
        //intializing tile buttons
        this.FOOLS_LANDING = (Button)activity.findViewById(R.id.FOOLS_LANDING);
        this.BRONZE_GATE = (Button)activity.findViewById(R.id.BRONZE_GATE);
        this.GOLD_GATE = (Button)activity.findViewById(R.id.GOLD_GATE);
        this.CORAL_PALACE = (Button)activity.findViewById(R.id.CORAL_PALACE);
        this.SUN_TEMPLE = (Button)activity.findViewById(R.id.SUN_TEMPLE);
        this.SILVER_GATE = (Button)activity.findViewById(R.id.SILVER_GATE);
        this.PHANTOM_ROCK = (Button)activity.findViewById(R.id.PHANTOM_ROCK);
        this.WATCHTOWER = (Button)activity.findViewById(R.id.WATCHTOWER);
        this.COPPER_GATE = (Button)activity.findViewById(R.id.COPPER_GATE);
        this.ABANDONED_CLIFFS = (Button)activity.findViewById(R.id.ABANDONED_CLIFFS);
        this.WHISPERING_GARDENS = (Button)activity.findViewById(R.id.WHISPERING_GARDENS);
        this.SHADOW_CAVE = (Button)activity.findViewById(R.id.SHADOW_CAVE);
        this.LOST_LAGOON = (Button)activity.findViewById(R.id.LOST_LAGOON);
        this.MOON_TEMPLE = (Button)activity.findViewById(R.id.MOON_TEMPLE);
        this.DECEPTION_DUNES = (Button)activity.findViewById(R.id.DECEPTION_DUNES);
        this.TWILIGHT_HOLLOW = (Button)activity.findViewById(R.id.TWILIGHT_HOLLOW);
        this.EMBER_CAVE = (Button)activity.findViewById(R.id.EMBER_CAVE);
        this.TIDAL_PALACE = (Button)activity.findViewById(R.id.TIDAL_PALACE);
        this.OBSERVATORY = (Button)activity.findViewById(R.id.OBSERVATORY);
        this.IRON_GATE = (Button)activity.findViewById(R.id.IRON_GATE);
        this.CRIMSON_FOREST = (Button)activity.findViewById(R.id.CRIMSON_FOREST);
        this.MISTY_MARSH = (Button)activity.findViewById(R.id.MISTY_MARSH);
        this.BREAKERS_BRIDGE = (Button)activity.findViewById(R.id.BREAKERS_BRIDGE);
        this.HOWLING_GARDEN = (Button)activity.findViewById(R.id.HOWLING_GARDEN);

        //if an action button is pressed call the onClickListener method
        quitButton.setOnClickListener(this);
        deckButton.setOnClickListener(this);
        drawTreasureButton.setOnClickListener(this);
        drawFloodButton.setOnClickListener(this);
        moveButton.setOnClickListener(this);
        shoreUpButton.setOnClickListener(this);
        discardButton.setOnClickListener(this);
        captureTreasureButton.setOnClickListener(this);
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
            game.sendAction(new GameOverAckAction(this));
        }
        else if(button.getId() == R.id.drawTreasureButton){
            game.sendAction(hand.drawTreasure(this));
        }
        else if(button.getId() == R.id.shoreUpButton){
            game.sendAction(FiGameState.shoreUp(FOOLS_LANDING));
        }
        else if(button.getId() == R.id.drawFloodButton){
            game.sendAction(FiGameState.drawFlood(this));
        }
        else if(button.getId() == R.id.moveButton){
            game.sendAction(FiGameState.move(FOOLS_LANDING));
        }
        else if(button.getId() == R.id.discardButton){
            game.sendAction(FiGameState.discard(FOOLS_LANDING));
        }
        else if(button.getId() == R.id.captureTreasureButton){
            game.sendAction(FiGameState.captureTreasure(FOOLS_LANDING));
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
