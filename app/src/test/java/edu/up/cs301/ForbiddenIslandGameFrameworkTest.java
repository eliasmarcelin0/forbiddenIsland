package edu.up.cs301;

import org.junit.Test;

import static org.junit.Assert.*;

import edu.up.cs301.tictactoe.infoMessage.FiGameState;
import edu.up.cs301.tictactoe.players.HumanPlayer;
import edu.up.cs301.tictactoe.Tile;

/**
 * RunTest button should call this class and run everything below
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ForbiddenIslandGameFrameworkTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testToString() {
    }
    @Test
    public void initBoard() {
    }
    @Test
    public void resetBoard() {
        FiGameState fiGameState = new FiGameState();
        fiGameState.initBoard();
        Tile[] board1 = fiGameState.getBoard();
        //putmoveor change omsething like shore level
        fiGameState.resetBoard();
        Tile[] board2 = fiGameState.getBoard();
        for(int i = 0; i < 8; i++) {
   //         assertArrayEquals(board1[i], board2[i]);
        }
    }
    @Test
    public void movePieces() {
    }

    @Test
    public void changeTurn() {
        FiGameState fiGameState = new FiGameState();
        int i = fiGameState.getPlayerTurn();
        fiGameState.changeTurn(fiGameState);
        int j = fiGameState.getPlayerTurn();
        assertNotEquals(i, j);
    }

    @Test
    public void getMoves() {
    }

    @Test
    public void getTurn() {

    }

    @Test
    public void getBoard() {
        FiGameState fiGameState = new FiGameState();
        fiGameState.initBoard();
        Tile[] board1 = fiGameState.getBoard();
        fiGameState.resetBoard();
        Tile[] board2 = fiGameState.getBoard();
        for(int i = 0; i < 8; i++) {
//            assertArrayEquals(board1[i], board2[i]);
        }
    }

    @Test
    public void setMoves() {
    }

    @Test
    public void setBoard() {
    }

}