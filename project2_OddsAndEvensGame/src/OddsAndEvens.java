/*
ODDS AND EVEN GAME (player VS computer) where each player will choose either "odds" or "evens",
 each choose a number of fingers to play- 0 to 5.
 The winner is determined by whether the sum of your fingers is odd or even (depending on what you chose)
 */

import java.util.Scanner;
import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let's play a game called ODDS AND EVENS! ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String option = "y";
        while (option.equals("y")) {

            System.out.print("Hi " + name + ",Which do you choose? " + "\t(O)DDS" +"\tOR"+ "\t(E)VENS :");
            String ch = input.next();

            if (ch.equalsIgnoreCase("o")) {
                System.out.println(name + " has picked Odds! The computer will be Evens! ");
            } else if (ch.equalsIgnoreCase("e")) {
                System.out.println(name + " has picked Evens! The computer will be Odds! ");
            }
            System.out.println("---------------------------------------------");
            System.out.println();

            //computer chooses fingers and calculztion of sum
            System.out.print("How many fingers do you put out? ");
            int player = input.nextInt();
            Random rand = new Random();
            int comp = rand.nextInt(6);
            System.out.println("The computer plays " + comp + " fingers! ");
            System.out.println("---------------------------------------------");
            System.out.println();

            //result
            int sum = player + comp;
            System.out.println(player + "+" + comp + "= " + sum);

            if(sum%2==0)
            {
                System.out.println(sum + " is....Even");
                if(ch.equalsIgnoreCase("o"))
                {
                    System.out.println("That means computer wins!");
                }else
                {
                    System.out.println("That means " + name + " wins!");
                }
            }else
            {
                System.out.println(sum + " is....Odd");
                if(ch.equalsIgnoreCase("o"))
                {
                    System.out.println("That means " + name + " wins!");
                }else{
                    System.out.println("That means computer wins!");
                }
            }




            System.out.println("---------------------------------------------");
            System.out.println();

            System.out.print("Want to play again(y/n)? ");
            option = input.next();

        }

    }
}




