

import java.util.Random;
import java.util.Scanner;

public class LotteryProgram {

  public static void main(String[] args) {
    Random rand = new Random();
    int numberToGuess = rand.nextInt(1000000);
    int number = 0;
    Scanner input = new Scanner(System.in);
    int count = 0;
    boolean win = false;

    System.out.println("Do you want to win million dollars(y/n) ");
    String yes = input.nextLine();

    if (yes.equals("y") | yes.equals("Y"))
    {
      System.out.println("Guess a number between 1- 100000 ");
      while (win == false)
      {

        System.out.println("Insert 1 euro and enter a number or q to quit  ");

        // int number=input.nextInt();

        String quit = input.nextLine();
        if (quit.equals("q") | quit.equals("Q"))
        {
          break;

        }
        number = Integer.parseInt(quit);
        count+=1;
        if (number == numberToGuess)
        {
          win = true;
          System.out.println(" congrats");

        }
        // if quit == q --- break
        // else
        // number = Integer.parseInt(quit);

        else if (number != numberToGuess)
        {
          System.out.println(" Sorry, good guess, but not quite right. Do you want me to give you a hint (y|n)?");

          String hint = input.nextLine();
          if (hint.equals("y") | hint.equals("Y"))
          {
            System.out.println("Insert 2 euros for hint");
            count+=2;
            if (number < numberToGuess)
            {
              System.out.println("Your guess id too low");
            } else
            {
              System.out.println("Your guess id too High");
            }
          }

        }
      }
    }
    System.out.println("you lost  " + count + " euros");
  }
}


