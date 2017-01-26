import java.util.*;
/**
Brendan DeMilt Chris Pan
1/25/17
Period: 8
guess a Number git tested no documentation needed, testing purposes soley
*/

public class GuessANumber{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean kik = true;
        boolean kek = true;
        int number = 0;
        int guess = 0;
        int counter1 = 0;
        int counter2 = 0;
        while(kek)
        {
            counter2++;
            System.out.println("I have a number between 1 and 100.");
            System.out.println("Can you guess my number?");
            System.out.println("Please type your first guess.");
            number = (int)(Math.random() * 100 + 1);
            kik = true;
            counter1 = 0;
            while(kik)
            {
                counter1++;
                guess = in.nextInt();
                if(guess == number)
                {
                    System.out.println("Excellent! You guessed the number! You guessed in " + counter1 + " tries.");
                    kik = false;
                }
                else if(guess < number)
                {
                    System.out.println("Too low. Try again.");
                }
                else
                {
                    System.out.println("Too high. Try again.");
                }
            }
            System.out.println("You have played " + counter2 + " games.");
            System.out.println("Would you like to play again (y/n)?");
            kek = !in.next().equals("n");
        }
    }
}
