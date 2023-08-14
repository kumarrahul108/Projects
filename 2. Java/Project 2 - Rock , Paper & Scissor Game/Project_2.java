
// Game : Rock , Paper , Scissors 


import java.util.Random;
import java.util.Scanner;

class Project_2
{
    public static void main(String[] args)
    {
        /* 
             0 : Rock
             1 : Paper
             2 : Scissor
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter : \n 0 for Rock \n 1 for Paper \n 2 for Scissor \n");
         int userInput = sc.nextInt();

         Random random = new Random();
         int computerInput = random.nextInt(3);  // Generated Random no :-> [0,2)]

         if(userInput == computerInput)
         {
            System.out.println("\nDRAW");
         }
         else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1)
        {
            System.out.println("\nYou WIN !! ");
        }
        else 
        {
            System.out.println("\nComputer Win !!");
        }

        // System.out.println("\n Your Choice : " + userInput);
        // System.out.println("\n Computer Choice : " + computerInput);

        if(computerInput == 0)
        {
            System.out.println("Computer Choice : Rock");
        }

        else if(computerInput == 1)
        {
            System.out.println("Computer Choice : Paper");
        }

        else if(computerInput == 2)
        {
            System.out.println("Computer Choice : Scissor");
        }
    }
}