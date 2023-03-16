class Maximum_and_Minimum {
  public static void main(String[] args) {
    int[][] a1 = new int[3][7];
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < a1.length; i ++)
    {
      for (int j = 0; j < a1[i].length; j ++)
      {
        a1[i][j] = (int)(Math.random()*45) + 5;
        System.out.print(a1[i][j] + "\t");
        if (a1[i][j] < min){
          min = a1[i][j];
        }
      }
      System.out.println();
    }
      System.out.println("\nThe smallest value in the array is " + min);
    }
  }