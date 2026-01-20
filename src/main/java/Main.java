import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Good luck!");

        Scanner scanner = new Scanner(System.in);
        GameEngine engine = new GameEngine(1, 100);
        GameUI ui = new GameUI(engine, scanner);

        boolean playAgain = true;
        while (playAgain) {
            ui.start();
            System.out.print("Play again? (y/n): ");
            String ans = scanner.nextLine().trim().toLowerCase();
            playAgain = ans.equals("y") || ans.equals("yes");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}

