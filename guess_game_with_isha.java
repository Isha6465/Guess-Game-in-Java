import java.util.Scanner;
import java.util.Random;
public class guess_game_with_isha {
    public static void main(String[] args) 
    {
        System.out.println("lets play the guess game");
        System.out.println("______________________");
        int no_of_guesses = 0;
        Scanner sc = new Scanner(System.in);
        Random mc = new Random();
        int random_number = mc.nextInt(50);
        int user_input;
        while(true)
        { 
            
            no_of_guesses++;
             System.out.println("Entered  number must have between 1 to 50 ");
              user_input = sc.nextInt();
             if (user_input == random_number) {
            System.out.println("Your answer is correct! You Win!");
            break;
        }
        else if (user_input > random_number) {
            System.out.println("You guessed the greater number.\nTry Again");
            
        }
        else  {
            System.out.println("You guessed the smaller number.\nTry Again");
            
        }
          if (user_input <= 0 || user_input > 100) {
            System.out.println("Invalid Input!\nAs your number is not between 1 and 100");
            break;}

    }
    System.out.println("the random number is: " +  random_number);
  System.out.println("the no of guesses are : " +  no_of_guesses);
    System.out.println("game end!!!!!");
sc.close();
}}