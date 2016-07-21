package com.isoftechtraining;

import java.util.*;

/**
 * Created by Rajesh on 6/29/2016.
 */
public class ListClass {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Set<String> snames = new HashSet<>();
        addToList(names);
        extractList(names);
        addToSet(snames);
        extractSet(snames);



    }

    private static void extractList(List<String> names) {
        names.stream().forEach(e-> System.out.println(e));
    }

    private static void addToList(List<String> names) {
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


}

