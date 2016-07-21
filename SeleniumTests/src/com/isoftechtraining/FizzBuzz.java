package com.isoftechtraining;

/**
 * Created by Rajesh on 6/24/2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        int min=0,max=50;

        String[] values = new String[max+1];
        for(int i = min ;i <= max ;i++)
        {
            values[i]="";
            if( i%3 == 0)    //div by 3
            {
                values[i]="fizz";
            }
            if(i%5 == 0)    //div by 5
            {
                values[i]=values[i]+"buzz";
            }
            if( i%3 !=0 && i%5 != 0)
            {
                values[i]=String.valueOf(i);
            }

            System.out.print(values[i]+" ");
        }

    }
}
