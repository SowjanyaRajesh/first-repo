package com.isoftechtraining;


import java.util.Scanner;

/**
 * Created by Rajesh on 6/19/2016.
 */
public class FromConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name...");

        String name = sc.next();

        System.out.println("Name in upper case: "+ name.toUpperCase());

        System.out.println("Enter value..");

        String val = sc.next();
        Double convVal = Double.parseDouble(val);

        System.out.println("value is: "+ convVal);


        System.out.println("Enter value..");
        Double dobVal = sc.nextDouble();
        System.out.println("value is: "+ dobVal);


        //to parsing from String to Integer use Integer.parseInt("1");  convert from Integer to String : String.valueOf(integervalue);
    }
}
