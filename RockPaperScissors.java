import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove = rps[random.nextInt(rps.length)];
        
        System.out.println("Enter move (rock, paper, or scissors). To exit the game, type \"exit\": ");
        String playerMove = scanner.nextLine();
        
        if (playerMove.equals("exit")) {
            System.out.println("Game exited.");
            scanner.close();
            return;
        }
        
        if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
            System.out.println("Invalid move, please enter rock, paper, or scissors.");
        } else {
            System.out.println("Computer move: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("scissors")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("paper")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("scissors")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }
            }
        }
        
        scanner.close();
    }
}