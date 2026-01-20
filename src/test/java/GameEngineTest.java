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
    void checkGuessIncrementsAttempts() {
        GameEngine engine = new GameEngine(1, 100);
        engine.checkGuess(1);
        assertEquals(1, engine.getAttempts());
    }

    @Test
    void quitEndsGame() {
        GameEngine engine = new GameEngine(1, 100);
        engine.quit();
        assertTrue(engine.hasUserQuit());
        assertTrue(engine.isGameOver());
        assertFalse(engine.isGameWon());
    }

    @Test
    void gameOverAfterMaxAttempts() {
        GameEngine engine = new GameEngine(1, 100);
        // We don't know target; just make 5 guesses. Game should be over by then
        for (int i = 0; i < engine.getMaxAttempts(); i++) {
            engine.checkGuess(1);
        }
        assertTrue(engine.isGameOver());
    }
}

