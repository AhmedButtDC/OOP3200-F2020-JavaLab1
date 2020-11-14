//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449,
//Last Modified:    November 14, 2020
//File:				OOP3200-F2020-JavaLab1

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Declarations
        int[][] score = new int[3][2]; //multidimensional score array ([3] represents number of players and [2]
        //represents number of games)
        float average = 0.0F; //used to store average
        String[] names = new String[]{"Ahmed", "Michai", "Tom"}; //string array to store names of players
        Scanner userInput = new Scanner(System.in); //scanner for user input

        //User Input Loop
        for(int person = 0; person < 3; person++) //loop through each person
        {
            for(int game = 0; game < 2; game++) //loop through each game
            {
                boolean isValid = false;

                while(!isValid) //loop as long as isValid = false
                {
                    System.out.print("Please enter " + names[person] + "'s score for GAME # " + (game + 1) + ": ");
                    try
                    {
                        score[person][game] = userInput.nextInt(); //user input occurs here
                        isValid = true; //if errors are found, this will change to false
                    }
                    catch (Exception e) //catch any errors
                    {
                        System.out.print("Invalid input. Numeric input needed. Please try again.\n\n");
                        userInput.nextLine();
                        isValid = false;
                    }
                    if (score[person][game] < 0 || score[person][game] > 300) //if score not in range
                    {
                        System.out.print("Invalid input. Value between 0 and 300 needed. Please try again.\n\n");
                        isValid = false;
                    }
                }
            }
            System.out.println();
        }

        System.out.println();

        //Output Loop
        for(int person = 0; person < 3; ++person) //loop through each person
        {
            System.out.print("Score details for " + names[person] + ":\n"); //display title with name of person

            for(int game = 0; game < 2; ++game) //loop through each game
            {
                System.out.print("Game # " + (game + 1) + ": " + score[person][game] + "\n"); //display score
            }

            average = (float)(score[person][0] + score[person][1]) / 2.0F; //finding average
            System.out.printf("Average for " + names[person] + ": %.1f\n\n", average); //display average
        }
    }
}