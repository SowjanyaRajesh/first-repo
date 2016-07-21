package com.isoftechtraining;

import java.util.Scanner;

/**
 * Created by Rajesh on 6/24/2016.
 */
public class ComputerGuess {

    static int max = 100,min=0;
    static int compGuess = (int)(Math.random()*Integer.MAX_VALUE)%max;
    int random;


    public int increaseValue(int compGuess)
    {
        min=compGuess+1;
        System.out.println("change computer guess, between "+min+" and "+ (max));
        random=(int)(((Math.random()*Integer.MAX_VALUE)%(max-compGuess))+(min));
        return random;

    }

    public int decreaseValue(int compGuess)
    {
        max=compGuess-1;
        System.out.println("Decrease computer guess, between "+min+" and "+ (max));
        random=(int)(((Math.random()*Integer.MAX_VALUE)%(compGuess-min)+(min)));
        return random;

    }

    public static void main(String[] args) {

        //number between 0-100
        ComputerGuess cg = new ComputerGuess();

        System.out.println("Computer guess is " + compGuess);
        System.out.println("Enter equal/less/greater");
        Scanner sc = new Scanner(System.in);
        String compare = sc.next();
        if (compare.equals("equal")) {
            System.out.println("Computer guess and user value are equal " + compGuess);


        } else {
            do {
                if (compare.equals("less")) {
                    System.out.println("Computer guess is less than user guess..try again");
                    compGuess = cg.increaseValue(compGuess);

                    System.out.println("Computer guess is " + compGuess);

                } else if (compare.equals("greater")) {
                    System.out.println("Computer guess is greater than user guess..try again");
                    compGuess = cg.decreaseValue(compGuess);

                    System.out.println("Computer guess is " + compGuess);
                }

                compare = sc.next();

            } while (!compare.equals("equal"));

        }
    }

}
