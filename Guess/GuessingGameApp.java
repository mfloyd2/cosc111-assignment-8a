
/**
 * Write a description of class GuessingGameApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGameApp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(1000)+1;
        int guess = 0;
        int guesses[] = new int[1000];
        int numbguess = 0;
        
        for(int i = 0; guess != number; i++)
        {
            System.out.println("Guess the Number");
            guess = input.nextInt();
            if( guess> number)
            {
                System.out.println("Lower");
            }
            else
            {
                System.out.println("Higher");
            }
            guesses[i] = guess;
            numbguess = i;
        }
        System.out.println();
        System.out.println("Number of Guesses");
        System.out.println(numbguess);
        System.out.println();
        System.out.println("Past Guesses: ");
        for(int y= 0; y<numbguess; y++)
        {
            System.out.println(guesses[y]);
        }
    }
}
