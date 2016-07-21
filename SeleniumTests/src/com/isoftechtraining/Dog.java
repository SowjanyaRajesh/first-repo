package com.isoftechtraining;

/**
 * Created by Rajesh on 6/25/2016.
 */
public class Dog extends Animal{

    public void makeSound()                 //overriding , because it is from super class
    {
        System.out.println("bark");

    }

    public void makeSound(String str)        //overloading
    {
        System.out.println("Sound"+str);
       // return 1;
    }
}
