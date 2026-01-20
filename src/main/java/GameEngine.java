public class GameEngine {

    private final int min;
    private final int max;
    private final int target;

    private int attempts;
    private boolean gameWon;
    private boolean userQuit;
    private boolean gameOver;

    private static final int MAX_ATTEMPTS = 5;

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;
        this.target = Utils.randomInt(min, max);
        this.attempts = 0;
        this.gameWon = false;
        this.userQuit = false;
        this.gameOver = false;
    }

    public String checkGuess(int guess) {
        if (gameOver) {
            return "Game is already over.";
        }

        attempts++;

        if (guess == target) {
            gameWon = true;
            gameOver = true;
            return "Correct! You won in " + attempts + " attempts.";
        }

        if (attempts >= MAX_ATTEMPTS) {
            gameOver = true;
            return "Game over! Maximum attempts reached. The number was " + target + ".";
        }

        if (guess < target) {
            return "Too low!";
        } else {
            return "Too high!";
        }
    }

    public void quit() {
        userQuit = true;
        gameOver = true;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean hasUserQuit() {
        return userQuit;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}

