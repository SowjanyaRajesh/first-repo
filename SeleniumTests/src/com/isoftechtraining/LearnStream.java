package com.isoftechtraining;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by Rajesh on 7/5/2016.
 */
public class LearnStream {

    public static void main(String[] args) {

        OptionalInt first = IntStream.range(1,100).filter(e->isGreater(e,50)).filter(e->e%7 == 0).findAny();

        if(first.isPresent())
        {
            System.out.println(first.getAsInt());

        }

    }



    private static boolean isGreater(int number, int limit)
    {
        return number>limit;
    }
}
