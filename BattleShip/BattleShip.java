import java.util.Scanner;

class BattleShip {
  public static void main(String[] args) {
    System.out.println("BattleShip!");
    char [][] board = initBoard();
    printBoard(board);
    Scanner reader = new Scanner(System.in);
    int guess = 10;
    boolean win = false;

    //set the location of the ship(s) (HARD CODE)
    int boatx = 3;
    int boaty = 1;

    //loop start
    while(guess > 0){

      //ask for row col
      System.out.print("Enter a row: ");
      int row = reader.nextInt();
      System.out.print("Enter a column: ");
      int col = reader.nextInt();

      //make sure row/col is valid
      if(board[row][col] != '~'){
        System.out.println("Try again");
        continue;
      }

      // check if guess is correct
      if(boatx == row && boaty == col ){
        board[row][col] = 'b';
        win = true;
        printBoard(board);
        break;
      }
      else{
        board[row][col] = 'x';
        System.out.println("Try again");
      }

      //print board
      printBoard(board);

      guess--;
    }
    //loop end

    //game end win/lose/etc
    if(win){
      System.out.println("You Win!");
    }
    else{
      System.out.println("You lose");
    }
  }

  public static void printBoard(char[][] board)
  {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println("");
    }
  }

  public static char[][] initBoard()
  {
    char[][] board = new char[7][7];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
      board[i][j] = '~';
      }
    }
    return board;
  }
}