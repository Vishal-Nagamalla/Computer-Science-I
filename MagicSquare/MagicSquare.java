import java.util.Scanner;

class MagicSquare {
  public static void main(String[] args) {
    int sumrow, sumcol, sumdiagonal = 0, sum = 0;
    boolean magic = true;
    int[][] square = new int[4][4];
    Scanner input = new Scanner(System.in);

    System.out.print("Enter numbers --> ");
    for (int i=0; i<4; i++)
      for (int j=0; j<4; j++)
        square[i][j] = input.nextInt();

    System.out.println("Square : ");
    for (int i=0; i<4; i++) {
      for (int j=0; j<4; j++)
        System.out.print(square[i][j] + " ");
      System.out.println();
    }

    for (int j=0; j<4; j++){
      sum += square[0][j];
    }
    for (int i=0; i<4; i++) {
      sumrow = 0;
      for (int j=0; j<4; j++)
        sumrow += square[i][j];
      if (sumrow != sum) {
        magic = false;
        break;
      }
    }

    if (magic) {
      for (int j=0; j<4; j++) {
        sumcol = 0;
        for (int i=0; i<4; i++)
          sumcol += square[i][j];
        if (sumcol != sum) {
          magic = false;
          break;
        }
      }
    }

    if (magic) {
      for (int i=0; i<4; i++)
        for (int j=0; j<4; j++)
          if (i==j)
            sumdiagonal += square[i][j];
      if (sumdiagonal != sum) {
        magic = false;
      }
    }

    if (magic) {
      sumdiagonal = 0;
      for (int i=0; i< 4; i++)
        for (int j=0; j<4; j++)
          if ((i+j) == 3)
            sumdiagonal += square[i][j];
      if (sumdiagonal != sum) {
        magic = false;
      }
    }

    if (magic)
      System.out.println("It IS a magic square!");
    else
      System.out.println("It is NOT a magic square.");
  }
}