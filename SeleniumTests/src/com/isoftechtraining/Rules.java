package com.isoftechtraining;

import java.util.Scanner;

/**
 * Created by Rajesh on 6/21/2016.
 */
public class Rules {

    public static void main(String[] args) {
        double random = Math.random();
        String[] rule = {"PAPER","LOVE","SPOCK","ROCK","DEVIL","SCISSOR","LIZARD"};

        int computerChoice = (int)(random*Integer.MAX_VALUE)%(rule.length);

      //  System.out.println("Comp Choice : "+computerChoice);
        System.out.println("Enter User Choice 0-6: ");

        Scanner sc= new Scanner(System.in);
        int userChoice = sc.nextInt();

        String cChoice = rule[computerChoice];
        String uChoice = rule[userChoice];

        System.out.println("Computer Choice is : "+cChoice);
        System.out.println("User Choice is : "+uChoice);

        if(cChoice.equals(uChoice))
        {
            System.out.println("Tie...");
        }
        else {
            for (int i = 0; i < rule.length ; i++) {
                if (cChoice.equals(rule[i]) && i < rule.length-3) {
                   if(uChoice.equals(rule[i+1]) || uChoice.equals(rule[i+2]) || uChoice.equals(rule[i+3]))
                    {
                        System.out.println("Computer choice "+ cChoice + " won");
                    }
                    else
                    {
                        System.out.println("User choice "+uChoice+" won");
                    }

               }
                else if(cChoice.equals(rule[i]) && i >= rule.length-3)
                {
                    if(uChoice.equals(rule[i-1]) || uChoice.equals(rule[i-2]) || uChoice.equals(rule[i-3]))
                    {
                        System.out.println("User choice "+ uChoice + " won");
                    }
                    else
                    {
                        System.out.println("Computer choice "+cChoice+" won");
                    }
                }
            }
        }



    }



}
