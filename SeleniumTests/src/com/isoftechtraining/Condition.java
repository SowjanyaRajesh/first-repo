package com.isoftechtraining;

import java.util.Scanner;

/**
 * Created by ramana on 6/19/16.
 */
public class Condition {

    public static void main(String[] args) {
        final int SIZE=7;
        String[] names = {"Rock", "Paper","Scissor","Lizard","Spock","Love","Devil" ,"Rock", "Paper","Scissor","Lizard","Spock","Love","Devil"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player's choice");
        String userInput = scanner.next();

        double randomValue = (Math.random()*Integer.MAX_VALUE)%SIZE;
        int computerChoiceVal = (int)randomValue;
        String computerChoice="";
        if (computerChoiceVal > -1 && computerChoiceVal < names.length-1)
            computerChoice=names[computerChoiceVal];
        System.out.println("Computer choice is " +computerChoice);

        boolean userChoiceNotFound =true;
        int index=0;
        int userChoicePosition = 0;

        while(userChoiceNotFound) {
            if(index == names.length -1)
            {
                userChoiceNotFound=false;
            }
            if(userInput.equalsIgnoreCase(names[index]))
            {
                userChoiceNotFound=false;
                userChoicePosition=index;
            }
            index++;
        }
        System.out.println("User position = "+userChoicePosition);
        System.out.println("Computer position = "+computerChoiceVal);
        if(userChoicePosition == computerChoiceVal)
        {
            System.out.println("Tie Both players choose the same value");
        }
        else {
            boolean computerWins=false;
//            int lowerVal = (computerChoiceVal >userChoicePosition)? userChoicePosition:computerChoiceVal;
            for (int i = userChoicePosition; i <= (userChoicePosition+SIZE/2) ; i++) {
                if(computerChoice.equalsIgnoreCase(names[i]))
                {
                    i=names.length-1;
                    computerWins=true;
                }
            }
            if (computerWins)
                System.out.println("Computer is winner");
            else
                System.out.println( "Player wins");
        }
    }

}

