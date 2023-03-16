import java.util.Scanner;
class User_num_and_RND_num_into_Sum_Product_Avg {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Please enter a number between 1-100: ");
    int num = reader.nextInt();
    int random = (int)(Math.random()*(100-65+(1))) + 65;
    System.out.println("Your random value is: " + random);
    int sum = num + random;
    int product = num * random;
    double average = (num + random) / 2;
    System.out.println("Results Below!");
    System.out.println("Sum: " + sum + "  Product: " + product + "  Average: " + average);
  }
}