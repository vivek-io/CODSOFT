import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 80) + 1; //This is used to generate the random number
        int maxAttempts = 7; //Attempts given to the user
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while(attempts < maxAttempts){ //Condition for the attempts
            System.out.println("Enter the number please!");
            int guess = sc.nextInt();

            if(guess == randomNumber){
                System.out.println("Great job!You guessed the right number.");
                break;
            }
            else if(guess < randomNumber){
                System.out.println("Your guess is to low.");
            }
            else {
                System.out.println("Your guess is to high.");
            }
            attempts++;
        }
        if(attempts == maxAttempts){
            System.out.println("Sorry! You have exceeded the maximum guess limit.");
        }
    }
}