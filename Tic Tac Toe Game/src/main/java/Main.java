public class Main {
    public static void main(String[] args) {
        //Using 2D Array of chars to print the board
        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};
        //Print the board
        System.out.println("-------");
        System.out.println("|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|");
        System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
        System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
        System.out.println("-------");
    }
}
