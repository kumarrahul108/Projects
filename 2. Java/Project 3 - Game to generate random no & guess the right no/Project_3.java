

/*  Program :
              Create a class Game, which allows a user to play "Guess the Number" game once.

                Game should have the following methods:
                1. Constructor to generate the random number
                2. takeUserInput() to take a user input of number
                3. isCorrectNumber() to detect whether the number entered by the user is true
                4. getter and setter for noOfGuesses
                   Use Properties such as noOfGuesses(int), etc to get thid task done !! 

*/

import java.util.Scanner;
import java.util.Random;

class Game 
{
  public int number;
  public int inputNumber;
  public int noOfGuesses = 0;

  // Setter
  public void setnoOfGuesses(int noOfGuesses)
  {
    this.noOfGuesses = noOfGuesses;
  }

  // Getter
  public int getnoOfGuesses()
  {
    return noOfGuesses;
  }

  // Constructor to generate Random numbers
  public void Game()
  {
    Random rand = new Random();
    this.number = rand.nextInt(100) ;
  } 

  // Method to take input from the User
  public void takeUserInput()
  {
    System.out.println("Guess the Number :  ");
    Scanner sc = new Scanner(System.in);
    inputNumber = sc.nextInt();
  }

  // To match the Inputed Number
  public boolean isCorrectNumber()
  { 
    noOfGuesses++;
    if (inputNumber==number){
        System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
        return true;
    }
    else if(inputNumber<number){
        System.out.println("Too low...");
    }
    else if(inputNumber>number){
        System.out.println("Too high...");
    }
    return false;
  }

}


class Project_3
{
    public static void main(String[] args)
    {
        Game g = new Game();

        boolean b = false;

        while(!b)
        {
        g.takeUserInput();
        b = g.isCorrectNumber();
        }

     }
}