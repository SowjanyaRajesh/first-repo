package com.isoftechtraining;

/**
 * Created by Rajesh on 6/18/2016.
 */

//by default every class in java extends Object class
public class Calculator {



    public static void main(String args[])
    {
        System.out.println("Hello! Sowjanya....");
        //   System.out.print("Hello! Sowjanya....123");
        //    add(1,2);

       //    Math.addExact(1,2);

        System.out.println("The sum of 2 numbers is "+  add(1,2));
        System.out.println("The difference of 2 numbers is "+  subtract(4,2));
        System.out.println("The multiplication of 2 numbers is "+  multiply(6,2));
        System.out.println("The division of 2 numbers is "+  div(8,3));  // num2 should not be 0, we have to place the function in try catch
        System.out.println("The modulus of 2 numbers is "+  mod(8,3));

        String firstName = "Sowjanya";
        String lastName = "Dodda";

        String fullName = firstName + " " + lastName;
        System.out.println("Full name is ... "+ fullName);


        double sumVal1 = add(3,4);
        Double sumVal2 = add(3,4);  // Double another rep of double, here we can use add2. some functions
        //System.out.println( sumVal2 == 8);  // this is the way we caompare
        System.out.println( sumVal2.equals(Double.valueOf(7)));  // 7 is int, but sumVal2 is Double, so convert
        System.out.println( sumVal2.equals(7.0));
        System.out.println( sumVal2.equals(7));  // it retunrns false, because 7 is integer sumVal2 is Double

    }

    //Perform calculator operations

    public static double add(double num1, double num2)
    {
       /* double sum = num1 + num2;
        return sum;*/
        return (num1+num2);
    }

    public static double subtract(double num1, double num2)
    {
       /* double sum = num1 + num2;
        return sum;*/
        return (num1-num2);
    }

    public static double multiply(double num1, double num2)
    {
       /* double sum = num1 + num2;
        return sum;*/
        return (num1*num2);
    }

    public static double div(double num1, double num2)
    {
       /* double sum = num1 + num2;
        return sum;*/
        return (num1/num2);
    }

    public static double mod(int num1, int num2)
    {
       /* double sum = num1 + num2;
        return sum;*/
        return (num1%num2);
    }



}
