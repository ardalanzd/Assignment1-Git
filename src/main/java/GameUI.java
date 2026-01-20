import java.util.Scanner;

public class GameUI {
    private final GameEngine engine;
    private final Scanner scanner;

    public GameUI(GameEngine engine, Scanner scanner) {
        this.engine = engine;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("I picked a number. Try to guess it!");

        while (!engine.isGameOver()) {
            System.out.print("Guess a number between " + engine.getMin() +
                    " and " + engine.getMax() + " (or -1 to quit): ");
            int guess = Utils.readInt(scanner);

            String result = engine.checkGuess(guess);
            System.out.println(result);
        }
    }
}

