public class GameEngine {

    private final int min;
    private final int max;
    private final int target;

    private int attempts;
    private boolean gameWon;
    private boolean userQuit;
    private boolean gameOver;

    private boolean hintsEnabled;

    private static final int MAX_ATTEMPTS = 5;

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;
        this.target = Utils.randomInt(min, max);

        this.attempts = 0;
        this.gameWon = false;
        this.userQuit = false;
        this.gameOver = false;
        this.hintsEnabled = true;
    }

    private String hintText(int guess) {
        if (!hintsEnabled || attempts < 3) return "";
        int diff = Math.abs(guess - target);
        if (diff <= 3) return " Hint: Very close!";
        if (diff <= 10) return " Hint: Close.";
        if (diff <= 25) return " Hint: Somewhat far.";
        return " Hint: Far away.";
    }

    public String checkGuess(int guess) {
        if (gameOver) return "Game is already over.";

        if (guess < 0) {
            userQuit = true;
            gameOver = true;
            return "Quitting game.";
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

        String base = (guess < target) ? "Too low!" : "Too high!";
        return base + hintText(guess);
    }

    public boolean isGameWon() { return gameWon; }
    public boolean hasUserQuit() { return userQuit; }
    public boolean isGameOver() { return gameOver; }
    public int getAttempts() { return attempts; }
    public int getMaxAttempts() { return MAX_ATTEMPTS; }
    public int getMin() { return min; }
    public int getMax() { return max; }

    public void setHintsEnabled(boolean enabled) {
        this.hintsEnabled = enabled;
    }
}

