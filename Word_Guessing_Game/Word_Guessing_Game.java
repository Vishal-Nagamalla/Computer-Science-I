import java.util.Scanner;

class Word_Guessing_Game{

    public static void main(String[] args) {

        String template = "____ ___ ____";
        int remainingguesses = 5;

        String word = "that was hard";
        System.out.println("Welcome to the guessing game! Guess one letter at a time. You have 5 incorrect guesses remaining.");

        while (remainingguesses > 0) {
            System.out.println("The Secret Phrase is: " + template + " (4/3/4)");
            Scanner player = new Scanner(System.in);
            System.out.print("Your guess: ");
            String guess = player.nextLine();

            for(int i = 0; i < word.length(); i ++) {
                if (guess.equals(Character.toString(word.charAt(i)))) {
                    template = template.substring(0, i) + guess + template.substring(i + 1, template.length());
                }
            }

            if(template.equals(word)) {
                System.out.println("Hooray! You guessed it!");
                break;
            }

            if(word.contains(guess)){
              System.out.println("Correct: You have " + remainingguesses + " incorrect guesses remaining.\n");
            }
            else{
              remainingguesses--;
              System.out.println("Incorrect: You have " + remainingguesses + " incorrect guesses remaining.\n");
            }
        }
        if(!template.equals(word)){
          System.out.println("You have lost.");
          System.out.println("The Secret Phrase is: " + word);
        }
    }
}