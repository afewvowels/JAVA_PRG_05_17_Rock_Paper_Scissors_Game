/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_17_rock_paper_scissors_game;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author bluebackdev
 * Write a program that lets the user play the game of Rock, Paper, Scissors
 * against the computer. The program should work as follows:
 * 
 * 1. When the program begins, a random number in the range of 1 through 3 is
 * generated. If the number is 1, then the computer has chosen rock. If the
 * number is 2, then the computer has chosen paper. If the number is 3, then
 * the computer has chosen scissors. (Don't display the computer's choice yet)
 * 
 * 2. The user enters his or her choice of "rock", "paper", or "scissors" at
 * the keyboard. (You can use a menu if you prefer.)
 * 
 * 3. The computer's choice is displayed.
 * 
 * 4. A winner is selected according to the following rules:
 * 
 *      * If one player chooses rock and the other player chooses scissors,
 *        then rock wins. (The rock smashes scissors.)
 *      * If one player chooses scissors and the other player chooses paper,
 *        then scissors wins. (Scissors cuts paper.)
 *      * If one player chooses paper and the other player chooses rock,
 *        then paper wins. (Paper wraps rock.)
 *      * If both players make the same choice, the game must be played again
 *        to determine the winner.
 * 
 * Be sure to divide the program into methods that perform each major task.
 */
public class JAVA_PRG_05_17_Rock_Paper_Scissors_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int intMenuSelection = -1;
        int intMoveComputer;
        int intMovePlayer;
        
        do
        {
            intMoveComputer = generateComputerMove();
            
            intMovePlayer = displayMenu();
            
            determineWinner(intMoveComputer, intMovePlayer);
            
        } while (intMovePlayer != 4);
    }
    
    public static int generateComputerMove()
    {
        int intComputerChoice;
        
        Random randomMove = new Random();
        
        intComputerChoice = randomMove.nextInt(3) + 1;
        
        return intComputerChoice;
    }
    
    public static int displayMenu()
    {
        int intChoicePlayer;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        do
        {
            System.out.println("Please select a move from the following menu options:");
            System.out.println("\t1. Rock");
            System.out.println("\t2. Paper");
            System.out.println("\t3. Scissors");
            System.out.println("\t4. Quit");

            intChoicePlayer = scrKeyboard.nextInt();
        } while (intChoicePlayer != 1 && intChoicePlayer != 2 &&
                intChoicePlayer != 3 && intChoicePlayer != 4);
        
        return intChoicePlayer;
    }
    
    public static void determineWinner(int intChoiceComputer, int intChoicePlayer)
    {
        if ((intChoiceComputer == 1 && intChoicePlayer == 1) ||
                (intChoiceComputer == 2 && intChoicePlayer == 2) ||
                (intChoiceComputer == 3 && intChoicePlayer == 3))
        {
            System.out.println("There was a tie");
        }
        else if (intChoiceComputer == 1 && intChoicePlayer == 2)
        {
            System.out.println("Computer chooses rock, player chooses paper");
            System.out.println("Player wins");
        }
        else if (intChoiceComputer == 1 && intChoicePlayer == 3)
        {
            System.out.println("Computer chooses rock, player chooses scissors");
            System.out.println("Computer wins");
        }
        else if (intChoiceComputer == 2 && intChoicePlayer == 1)
        {
            System.out.println("Computer chooses paper, player chooses rock");
            System.out.println("Computer wins");
        }
        else if (intChoiceComputer == 2 && intChoicePlayer == 3)
        {
            System.out.println("Computer chooses paper, player chooses scissors");
            System.out.println("Player wins");
        }
        else if (intChoiceComputer == 3 && intChoicePlayer == 1)
        {
            System.out.println("Computer chooses scissors, player chooses rock");
            System.out.println("Player wins");
        }
        else if (intChoiceComputer == 3 && intChoicePlayer == 2)
        {
            System.out.println("Computer chooses scissors, player chooses paper");
            System.out.println("Computer wins");
        }
        else if (intChoicePlayer == 4)
        {
            System.out.println("Thank you for playing");
        }
        else
        {
            System.out.println("ERROR DETERMINING WINNER");
        }
    }
}
