import java.util.Scanner;

public class game {
    Scanner sc = new Scanner(System.in);
    int row = 6;
    int column = 7;
    String red = "X";
    String player1;
    String player2;

    String[][] board = new String[row][column];

    public void initializeBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = "-"; // Initialize with empty spaces
                System.out.print(board[i][j] + "       ");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
    
    

    // take user input
    public void takeUserInput() {
        System.out.println("Player 1:: Enter the value (0 to 6) ");

        player1 = sc.nextLine();
      
        if (player1.equals("0")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][0].equals("-")) {
                    board[i][0] = "X";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player1.equals("1")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][1].equals("-")) {
                    board[i][1] = "X";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player1.equals("2")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][2].equals("-")) {
                    board[i][2] = "X";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player1.equals("3")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][3].equals("-")) {
                    board[i][3] = "X";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player1.equals("4")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][4].equals("-")) {
                    board[i][4] = "X";
                    break; // Place the token and exit the loop
                }

            }
        } else if (player1.equals("5")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][5].equals("-")) {
                    board[i][5] = "X";
                    break; // Place the token and exit the loop
                }
            }
        } else {
            System.out.println("Re-enter value");
        }
    }

    // take user input
    public void takeUserInputP2() {
        System.out.println("Player 2:: Enter the value (0 to 6) ");

        player2 = sc.nextLine();
        if (player2.equals("0")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][0].equals("-")) {
                    board[i][0] = "R";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player2.equals("1")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][1].equals("-")) {
                    board[i][1] = "R";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player2.equals("2")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][2].equals("-")) {
                    board[i][2] = "R";
                    break; // Place the token and exit the loop
                }
            }
        } else if (player2.equals("3")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][3].equals("-")) {
                    board[i][3] = "R";
                    break; // Place the token and exit the looR
                }
            }
        } else if (player2.equals("4")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][4].equals("-")) {
                    board[i][4] = "R";
                    break; // Place the token and exit the loop
                }

            }
        } else if (player2.equals("5")) {
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][5].equals("-")) {
                    board[i][5] = "R";
                    break; // Place the token and exit the loop
                }
            }
        } else {
            System.out.println("Re-enter value");
        }
    }
   

    public boolean checkWin(String playerToken) {
        // Check for horizontal wins
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= column - 4; j++) {
                if (board[i][j].equals(playerToken) &&
                    board[i][j + 1].equals(playerToken) &&
                    board[i][j + 2].equals(playerToken) &&
                    board[i][j + 3].equals(playerToken)) {
                    return true;
                }
            }
        }

        // Check for vertical wins
        for (int i = 0; i <= row - 4; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j].equals(playerToken) &&
                    board[i + 1][j].equals(playerToken) &&
                    board[i + 2][j].equals(playerToken) &&
                    board[i + 3][j].equals(playerToken)) {
                    return true;
                }
            }
        }

        // Check for diagonal wins (both directions)
        for (int i = 0; i <= row - 4; i++) {
            for (int j = 0; j <= column - 4; j++) {
                if (board[i][j].equals(playerToken) &&
                    board[i + 1][j + 1].equals(playerToken) &&
                    board[i + 2][j + 2].equals(playerToken) &&
                    board[i + 3][j + 3].equals(playerToken)) {
                    return true;
                }
                if (board[i][j + 3].equals(playerToken) &&
                    board[i + 1][j + 2].equals(playerToken) &&
                    board[i + 2][j + 1].equals(playerToken) &&
                    board[i + 3][j].equals(playerToken)) {
                    return true;
                }
            }
        }

        return false; // No win found
    }

    public void updateBoard() {
        System.out.println();
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = board[i][j];
                System.out.print(board[i][j] + "       ");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
    System.out.println("---------------------Connect Four game------------------------");
    System.out.println("--------------------------------------------------------------");
    System.out.println("--------------------------------------------------------------");
    System.out.println();
    System.out.println();
    System.out.println();
    game g = new game();
    g.initializeBoard(); // Initialize the board
    while (true) {
        g.takeUserInput();
        g.updateBoard();
        if (g.checkWin("X")) {
            System.out.println("Player 1 wins!");
            break;
        }
        g.takeUserInputP2();
        g.updateBoard();
        if (g.checkWin("R")) {
            System.out.println("Player 2 wins!");
            break;
        }
    }
}
}