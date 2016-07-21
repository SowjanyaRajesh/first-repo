package com.isoftechtraining;

import java.util.*;

/**
 * Created by Rajesh on 7/5/2016.
 */
public class MyList {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
//        Collection<String> names = new HashSet<>();
//        Collection<String> names = new LinkedList<>();

        populateData(names);
        Collections.sort(((List<String>) names));

        printFancyWay(names);


//        populateData(snames);
//        printFancyWay(snames);

 /*       long startTime = System.currentTimeMillis();

//        System.out.println(startTime);
        for (int i = 0; i <= 100000; i++)
        {
            ( (List<String>)anames).add(String.valueOf(i));
            //( (List<String>)lnames).add(0,String.valueOf(i));


        }
        long endTime = System.currentTimeMillis();

        printFancyWay(anames);
        System.out.println("Time taken to add to list is : "+(endTime - startTime));

//        populateData(lnames);

        int count =0;
        startTime = System.currentTimeMillis();
        for(int i=100000; i>=0; i--)
        {
                if(((List<String>)anames).contains(String.valueOf(i)))
                count++;

        }
        endTime = System.currentTimeMillis();
        System.out.println("count is :"+count);
        System.out.println("Time taken to search.."+(endTime-startTime));
*/

              //  ((List<String>) anames).
    }



    private static void printFancyWay(Collection<String> names) {
        names.stream().forEach(e-> System.out.println(e));
    }

    private static void populateData(Collection<String> names) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name...");

        String str = sc.next();
        while(!(str.equals("done")))
        {
            names.add(str);
            str = sc.next();
        }
    }

 /*   private static void addToList(List<String> names) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name...");

        String str = sc.next();
        while(!(str.equals("done")))
        {
            names.add(str);
            str = sc.next();
        }
    }


    private static void extractSet(Set<String> snames) {
        for (String str1: snames) {

            System.out.println(str1);
        }
    }

    private static void addToSet(Set<String> snames) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name...");

        String str = sc.next();
        while(!(str.equals("done")))
        {
            snames.add(str);
            str = sc.next();
        }
    }

*/

}
