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
            System.out.print("Enter your guess (or 'q' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitting game.");
                return;
            }

            int guess;
            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            String result = engine.checkGuess(guess);
            System.out.println(result);
        }
    }
}

