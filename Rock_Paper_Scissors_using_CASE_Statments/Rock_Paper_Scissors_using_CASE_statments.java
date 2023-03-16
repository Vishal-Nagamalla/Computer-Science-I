import java.util.Scanner;

class Rock_Paper_Scissors_using_CASE_statments {
  public static void main(String[] args) {
      Scanner rps = new Scanner(System.in);
      int playerscore = 0;
      int compscore = 0;
      for(int i = 1; i < 4; i++) {
      System.out.println("Round " + i);
      System.out.print("Enter RPS throw: ");
      String player1 = rps.nextLine();
      int comp = (int) (Math.random() * 3);
      String s = "scissor";
      String r = "rock";
      String p = "paper";
      String player1rep = "";
      String comprep = "";

    switch (comp) {
      case 0:
        comprep = "rock";
        break;

      case 1:
        comprep = "paper";
        break;

      case 2:
        comprep = "scissor";
        break;
      default:
    }

    switch (player1) {
      case "rock":
        player1rep = "rock";
        break;

      case "paper":
        player1rep = "paper";
        break;

      case "scissor":
        player1rep = "scissor";
        break;
      default:
    }

    System.out.println("Computer selects: " + comprep);

    if ((player1.equals(s) && comp == 0) || (player1.equals(p) && comp == 2) || (player1.equals(r) && comp == 1)) {
      System.out.println("Computer wins!");
      compscore = compscore + 1;
    }
    else if ((player1.equals(s) && comp == 1) || (player1.equals(r) && comp == 2) || (player1.equals(p) && comp == 0)) {
      System.out.println("You win!");
      playerscore = playerscore + 1;
    }
    else if ((player1.equals(s) && comp == 2) || (player1.equals(r) && comp == 0) || (player1.equals(p) &&  comp == 1)) {
      System.out.println("Draw");
    }
    }
    if (playerscore > compscore) {
      System.out.println("Result: YOU WIN!");
    }
    if (playerscore < compscore) {
      System.out.println("Result: COMPUTER WINS!");
    }
    if (playerscore == compscore) {
      System.out.println("Result: Tie!");
    }
  }
}