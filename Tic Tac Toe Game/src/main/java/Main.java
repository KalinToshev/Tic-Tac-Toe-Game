import java.util.Scanner;

public class Main {
    //Player -> X
    //Computer -> O
    public static void main(String[] args) {
        //Using 2D Array of chars to print the board
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

        //Taking user input -> He is going to choose numbers between 1 and 9
        //POSITIONS EXAMPLE:
        //1|2|3
        //-+-+-
        //4|5|6
        //-+-+-
        //7|8|9

        //Taking the number from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to play? (1...9)");
        String userInput = scanner.nextLine();

        //Placing the X on the userInput number
        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            case "2":
                board[0][1] = 'X';
                break;
            case "3":
                board[0][2] = 'X';
                break;
            case "4":
                board[1][0] = 'X';
                break;
            case "5":
                board[1][1] = 'X';
                break;
            case "6":
                board[1][2] = 'X';
                break;
            case "7":
                board[2][0] = 'X';
                break;
            case "8":
                board[2][1] = 'X';
                break;
            case "9":
                board[2][2] = 'X';
                break;
            default:
                System.out.println("Invalid position!");
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
