class Different_types_of_Loops {
  public static void main(String[] args) {
    //1
    for(int j = 1; j <= 2; j++){
      for(int k = 1; k <= 4; k++){
        System.out.print("$");
      }
      System.out.println("%");
    }
    System.out.println(" ");

    //2
    int a = 1;
		while (a <= 4) {
			int b = 1;
			while (b <= a) {
				System.out.print("*");
				b ++;
			}
			System.out.println();
			a ++;
    }
    System.out.println(" ");

    //3
    for (int i = 1; i <= 5; i++)
    {
      for (int j = 5 - i + 1; j >= 1; j--)
      {
        System.out.print(j);
      }
    System.out.println();
    }
  }
}