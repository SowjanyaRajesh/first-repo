package com.isoftechtraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Rajesh on 6/29/2016.
 */
public class InputStream {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();


        for(int i=0;i<=5;i++)
        {
            number.add(i);
        }
   //     System.out.println(IntStream.range(1,5).reduce(0,Integer::sum));
        //int sum=
        System.out.println(IntStream.range(1, 5).filter(n -> n % 2 == 1).map(n -> n * n).reduce(0,Integer::sum));

        IntStream.range(1, 5).filter(n -> n % 2 == 1).forEach(System.out::println);


       // number.filter(n -> n % 2 == 1).map(n -> n * n).reduce(0,Integer::sum);
        //    System.out.println(sum);
       // number.stream().filter(n->n>1).forEach(n-> System.out.println(n));
    }



}
