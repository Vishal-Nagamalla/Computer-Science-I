import java.util.Scanner;

class TicTacToe {
  public static void main(String[] args) {
    String[][] arr = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    System.out.println("Welcome to Tic Tac Toe!");
    printBoard(arr);
    Scanner reader = new Scanner(System.in);
    int player = 1;

//Loop for diffrent player
    while(!winner(arr) && player < 10){
      System.out.print("Please enter a row (0-2): ");
      int row = reader.nextInt();
      System.out.print("Please enter a col (0-2): ");
      int col = reader.nextInt();
      if(arr[row][col].equals(" "))
      {
        if(player % 2 == 1)
        {
          arr[row][col] = "X";
        }
        else
        {
          arr[row][col] = "O";
        }
        player ++;
        printBoard(arr);
      }
      else
          System.out.println("Spot is Taken, Try Again!");
  }
  if(player == 10 && !winner(arr))
  {
    System.out.println("It is a TIE!");
  }
}

//LOGIC FOR WINNER
  public static boolean winner(String[][] arr)
  {
    //horisontal
    if(arr[0][0].equals(arr[0][1]) && arr[0][0].equals(arr[0][2]) && !arr[0][0].equals(" "))
    {
      System.out.println(arr[0][0] + " is the WINNER!");
      return true;
    }
    if(arr[1][0].equals(arr[1][1]) && arr[1][0].equals(arr[1][2]) && !arr[1][0].equals(" "))
    {
      System.out.println(arr[1][0] + " is the WINNER!");
      return true;
    }
    if(arr[2][0].equals(arr[2][1]) && arr[2][0].equals(arr[2][2]) && !arr[2][0].equals(" "))
    {
      System.out.println(arr[2][0] + " is the WINNER!");
      return true;
    }
    //vertical
    if(arr[0][0].equals(arr[1][0]) && arr[0][0].equals(arr[2][0]) && !arr[0][0].equals(" "))
    {
      System.out.println(arr[0][0] + " is the WINNER!");
      return true;
    }
    if(arr[0][1].equals(arr[1][1]) && arr[0][1].equals(arr[2][1]) && !arr[0][1].equals(" "))
    {
      System.out.println(arr[0][1] + " is the WINNER!");
      return true;
    }
    if(arr[0][2].equals(arr[1][2]) && arr[0][2].equals(arr[2][2]) && !arr[0][2].equals(" "))
    {
      System.out.println(arr[0][2] + " is the WINNER!");
      return true;
    }
    //diagonal
    if(arr[0][0].equals(arr[1][1]) && arr[0][0].equals(arr[2][2]) && !arr[0][0].equals(" "))
    {
      System.out.println(arr[0][0] + " is the WINNER!");
      return true;
    }
    if(arr[0][2].equals(arr[1][1]) && arr[0][2].equals(arr[2][0]) && !arr[0][2].equals(" "))
    {
      System.out.println(arr[0][2] + " is the WINNER!");
      return true;
    }
      return false;
  }

//BOARD
  public static void printBoard(String[][] arr)
  {
    for (int i = 0; i < arr.length; i ++)
    {
      for (int j = 0; j < arr[i].length; j ++)
      {
        System.out.print(arr[i][j]);
        if (j < 2)
          System.out.print(" | ");
      }
      System.out.println();
      if (i < 2)
      {
        for (int j = 0; j < arr[i].length; j ++)
        {
          System.out.print(" - ");
        }
        System.out.println();
      }
    }
  }
}