import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameEngineTest {

    @Test
    void engineStartsNotOver() {
        GameEngine engine = new GameEngine(1, 100);
        assertFalse(engine.isGameOver());
        assertFalse(engine.isGameWon());
        assertFalse(engine.hasUserQuit());
        assertEquals(0, engine.getAttempts());
        assertEquals(5, engine.getMaxAttempts());
    }

    @Test
    void guessIncrementsAttempts() {
        GameEngine engine = new GameEngine(1, 100);
        engine.checkGuess(1);
        assertEquals(1, engine.getAttempts());
    }

    @Test
    void quitEndsGame() {
        GameEngine engine = new GameEngine(1, 100);
        String msg = engine.checkGuess(-1);
        assertTrue(engine.hasUserQuit());
        assertTrue(engine.isGameOver());
        assertTrue(msg.toLowerCase().contains("quit"));
    }

    @Test
    void gameOverAfterMaxAttempts() {
        GameEngine engine = new GameEngine(1, 100);
        for (int i = 0; i < engine.getMaxAttempts(); i++) {
            engine.checkGuess(1);
        }
        assertTrue(engine.isGameOver());
    }
}

