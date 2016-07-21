package com.isoftechtraining;

import java.util.Scanner;

/**
 * Created by Rajesh on 6/21/2016.
 */
public class RPS {

    public static void main(String[] args) {

        String[] rp = {"rock","paper","scissor","rock","paper","scissor"};

        int[] val = {0,1,2,0,1,2};

        double random = Math.random();

        System.out.println("random value is"+random);

        random = random*Integer.MAX_VALUE;
        int compChoice = (int)(random%3);

        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();

        System.out.println("computer choice "+compChoice);


        //

        // 0  1 2
        // r  p s

        if( value1 == compChoice)
        {
            System.out.println("Tie");
        }
        else {
            for (int i = 0; i < val.length - 1; i++) {
                if (val[i] == value1) {
                    if (val[i + 1] == compChoice) {
                        System.out.println("computer wins");        //
                    } else
                        System.out.println("User wins");
                }


            }


        }
    }
}
