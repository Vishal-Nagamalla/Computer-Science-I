import java.util.Scanner;

class Enter_Numbers_Output_Amount_Sum_and_Avg {
  public static void main(String[] args) {
  //1
    for(int x = 1; x < 10; x++)
    {
      System.out.println(x);
      x += 1;
    }
  //2
    int i = 5;
    while (i < 100)
    {
      System.out.print(i + " \n");
      i *= 2;
    }
  //3
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int count = 0;
      while (true)
      {
        System.out.print("Enter a number (-1 to quit): ");
        int a = input.nextInt();
          if(a == -1)
          break;
            sum += a;
            count += 1;
      }
      double average = (double) sum / count;
      System.out.println("You entered " + count + " numbers." + " The total is " + sum + "." + " The average is " + average + ".");
  }
}