class FOR_LOOP_IF_ELSE_STATMENTS {
  public static void main(String[] args) {
      //1
      for (int x = 0; x <= 2; x++) {
        for (int y = 0; y <= 4; y++) {
          if(x <= y){
          System.out.print("* ");
          }
          if(x == 1 && y == 4 || x == 2 && y == 3 || x == 2 && y == 4){
            System.out.print("");
          }
        }
      }

      System.out.println();
      System.out.println();

      //2
      int num = 2;
      for (int x = 1; x <= num * 2 + 1; x++)
      {
        for (int y = 0; y <= num * 2 + 1; y++)
        {
          if (x == y)
          {
            System.out.print("*");
          }
          if (x + y == num * 2 + 2)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println("");
      }
      System.out.println();

      //3
      for (int p = 1; p <= 10; p++)
      {
        if(p == 1){
          System.out.print("   ");
        }
        if(p == 2){
          System.out.println();
          System.out.print("  ");
        }
        if(p == 4){
          System.out.println();
          System.out.print(" ");
        }
        if(p == 7){
          System.out.println();
          System.out.print("7 ");
        }
        else{
          System.out.print(p + " ");
        }
      }
      System.out.println();
      System.out.println();
      //4
      for (int a = 1; a <= 9; a++)
      {
        if(a == 6){
          System.out.println();
          System.out.print("  ");
        }
        if(a == 9){
          System.out.println();
          System.out.print("    ");
          System.out.print("9");
        }
        else{
          System.out.print(a + " ");
        }
      }
      System.out.println();
      System.out.println();

      //5
      for (int j = 1; j <= 10; j++)
      {
        if(j == 5){
          System.out.println();
          System.out.print("  ");
        }
        if(j == 8){
          System.out.println();
          System.out.print("    ");
        }
        if(j == 10){
          System.out.println();
          System.out.print("     ");
          System.out.println("10");
        }
        else{
          System.out.print(j + " ");
        }
      }
  }
}