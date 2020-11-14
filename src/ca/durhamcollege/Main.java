//
//
//
//

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[][] score = new int[3][2];
        float average = 0.0F;
        String[] names = new String[]{"Ahmed", "Michai", "Tom"};
        Scanner userInput = new Scanner(System.in);

        for(int person = 0; person < 3; person++)
        {
            for(int game = 0; game < 2; game++)
            {
                boolean isValid = false;

                while(!isValid)
                {
                    System.out.print("Please enter " + names[person] + "'s score for GAME # " + (game + 1) + ": ");
                    try
                    {
                        score[person][game] = userInput.nextInt();
                        isValid = true;
                    }
                    catch (Exception e)
                    {
                        System.out.print("Invalid input. Numeric input needed. Please try again.\n\n");
                        userInput.nextLine();
                        isValid = false;
                    }
                    if (score[person][game] < 0 || score[person][game] > 300)
                    {
                        System.out.print("Invalid input. Value between 0 and 300 needed. Please try again.\n\n");
                        isValid = false;
                    }
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int person = 0; person < 3; ++person)
        {
            System.out.print("Score details for " + names[person] + ":\n");

            for(int game = 0; game < 2; ++game)
            {
                System.out.print("Game # " + (game + 1) + ": " + score[person][game] + "\n");
            }

            average = (float)(score[person][0] + score[person][1]) / 2.0F;
            System.out.printf("Average for " + names[person] + ": %.1f\n\n", average);
        }
    }
}
