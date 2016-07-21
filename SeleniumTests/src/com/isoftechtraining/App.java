package com.isoftechtraining;

/**
 * Created by Rajesh on 6/25/2016.
 */
public class App {

    public static void main(String[] args) {

   /*     Bicycle bc = new Bicycle();
        Bicycle bc1 = new Bicycle(1,2,3);       // c=1,s=2,g=3

        Bicycle bc2 = new MountainBike(4,5,3,"low");        //interface or lowest possible

        Bicycle bc4 = new Bicycle(5,3,1);

        MountainBike bc3 = new MountainBike(4,2,3,"high");


        bc2.printDescription();

        bc3.printDescription();
*/


    /*    Animal a1 = new Cat();
        a1.makeSound();
        a1 = new Dog();
        System.out.println(a1);     //a1 Object type
        a1.makeSound();
        a1= new Elephant();
        a1.makeSound();
        a1 = new Horse();
        a1.makeSound();

        Animal a1 = new Cat();
        Animal a2 = new Cat();


        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        //System.out.println(a1.equals(a2)); //false*/

        Person p1 = new Person("Sowjanya","d",2345677);
        Person p2 = new Person("Mohana","T",2345677);
        Person p3 = new Person("Mohana","T",2345677);
        Person p6 = p1;

        Person p4 = new Person();
        Person p5 = new Person();
        System.out.println(p4.equals(p5));
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p6));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());



      /*  String name = "Mohana";
        String name1 = "Mohana";
        //Boolean b = name.equals(name1);

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());*/






        // System.out.println(bc2.cadence +" "+ bc.gear+" " + bc.speed);
        //System.out.println(bc1.cadence +" "+ bc1.gear+" " + bc1.speed);
   //     System.out.println(bc.cadence +" "+ bc1.gear+" " + bc1.speed);

    }
}
