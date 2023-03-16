import java.util.Scanner ;
class Sum_of_random_numbers_Ingredents_list_MinMax {
  public static void main(String[] args) {
    //1
    int[] a1 = new int[4];
    int sum = 0;
    int start = 10;
    for(int i = 0; i < 4; i++){
      a1[i] = start;
      sum += a1[i];
      System.out.print(start + " ");
      start = start - 3;
    }
    System.out.println("\nSum: " + sum);
    System.out.println();

    //2
    Scanner recipe = new Scanner(System.in);
    String[] ingredents = new String[4];
    for (int i = 0; i < ingredents.length; i++)
    {
      System.out.print("Ingredent " + (i + 1) + " ");
      ingredents[i] = recipe.nextLine();
    }
    for(int i = 0; i < ingredents.length; i++){
      if (i == 0 || i == 1){
        System.out.print(ingredents[i] + ", ");
      }
      else if (i == 2){
        System.out.print(ingredents[i] + " and ");
      }
      else
        System.out.print(ingredents[i] + ".");
    }
    System.out.println(" Sounds Delicious!");
    System.out.println();

    //3
    int[] a3 = new int[10];
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a3.length; i ++)
    {
      a3[i] = (int)(Math.random()*25) + 1;
      if (a3[i] > max)
        max = a3[i];
      System.out.print(a3[i] + " ");
    }
    System.out.println("\nThe largest value in the array is " + max);
  }
}