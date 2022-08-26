import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        printBoard(board);

        playerMove(board);

        Random random = new Random();

        int computerMove;
        do {
            computerMove = random.nextInt(9) + 1;
        } while (!isValidMove(board, computerMove));
        placeMove(board, Integer.toString(computerMove), 'O');

        printBoard(board);
    }

    private static boolean isValidMove(char[][] board, int position) {
        return switch (position) {
            case 1 -> board[0][0] == ' ';
            case 2 -> board[0][1] == ' ';
            case 3 -> board[0][2] == ' ';
            case 4 -> board[1][0] == ' ';
            case 5 -> board[1][1] == ' ';
            case 6 -> board[1][2] == ' ';
            case 7 -> board[2][0] == ' ';
            case 8 -> board[2][1] == ' ';
            case 9 -> board[2][2] == ' ';
            default -> false;
        };
    }

    private static void playerMove(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to play? (1...9)");
        String userInput = scanner.nextLine();

        placeMove(board, userInput, 'X');
        scanner.close();
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println("Invalid position!");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
