import java.util.Scanner ;
class Guess_Computer_Generated_Number {
  public static void main(String[] args) {
    Scanner guessNum = new Scanner(System.in);
    System.out.print("Guess a number from 1 to 10: ");
    int num = guessNum.nextInt();
    int random = (int)(Math.random()*10) + 1;

    //This is the code to outup the correct answer
    if (random == num){
      System.out.println("Correct.  The number was: " + random);
    }

    //This is the code to output if the answer is too low
    else if(random - num == 1){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 1 too low.");
    }
    else if(random - num == 2){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 2 too low.");
    }
    else if(random - num == 3){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 3 too low.");
    }
    else if(random - num == 4){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 4 too low.");
    }
    else if(random - num == 5){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 5 too low.");
    }
    else if(random - num == 6){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 6 too low.");
    }
    else if(random - num == 7){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 7 too low.");
    }
    else if(random - num == 8){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 8 too low.");
    }
    else if(random - num == 9){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 9 too low.");
    }

    //This is the code to output if the answer is too high
    else if(num - random == 1){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 1 too high.");
    }
    else if(num - random == 2){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 2 too high.");
    }
    else if(num - random == 3){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 3 too high.");
    }
    else if(num - random == 4){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 4 too high.");
    }
    else if(num - random == 5){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 5 too high.");
    }
    else if(num - random == 6){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 6 too high.");
    }
    else if(num - random == 7){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 7 too high.");
    }
    else if(num - random == 8){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 8 too high.");
    }
    else if(num - random == 9){
      System.out.println("Incorrect.  The number was " + random + ".  Your guess was 9 too high.");
    }
  }
}