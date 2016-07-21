package com.isoftechtraining;

import java.util.Locale;

/**
 * Created by Rajesh on 6/21/2016.
 */
public class StrFunctions {

    public static void main(String[] args) {


        String str = "Java Class";
        String convStr = "";

        CharSequence cs = "Java Class";
        CharSequence cs1 = "Java";
        CharSequence cs2 = "Selenium";
        StringBuffer sb = new StringBuffer(str);
        char[] chr = {'C','l','a','s','s'};


        System.out.println("Character at position 7 is : "+ str.charAt(7 ));
        System.out.println("codepoint at position 2 is : "+ str.codePointAt(2) ); // return unicode
        System.out.println(str.codePointBefore(2) ); // return unicode
        System.out.println( str.codePointCount(2,3) ); // return unicode

        System.out.println(str.compareTo("java class") ); // return unicode

        System.out.println(str.compareToIgnoreCase("java class") );

        System.out.println(str.concat("a"));

        System.out.println(str.contains("Class"));


        System.out.println(str.contentEquals(cs));

        System.out.println(str.contentEquals(sb));

        convStr = convStr.copyValueOf(chr);
   //     System.out.println(convStr.copyValueOf(chr));
        System.out.println(convStr);

        convStr = convStr.copyValueOf(chr,1,4);
        System.out.println(convStr);

        System.out.println(str.endsWith("Class"));

        System.out.println(str.equals(sb));//---------------------------------------------------

        System.out.println(str.equalsIgnoreCase("java class"));

        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a',4));
        System.out.println(str.indexOf("ss"));

        System.out.println(str.intern());
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.length());

        System.out.println(str.matches("(.*)Class"));
        System.out.println(str.matches("[A-Z  a-z]"));
        System.out.println(str.matches("[0-9]"));


        System.out.println(str.offsetByCodePoints(2,5));

        System.out.println(str.replace('a','b'));

        System.out.println(str.replace(cs1,cs2));


        String str1 = "Hi..Welcome to java class!!! learning java...";
        String str2 = "boo:and:foo";

        System.out.println(str1.replaceAll("java","selenium"));

        System.out.println(str1.replaceAll("java(.*)","selenium"));
        System.out.println(str1.replaceFirst("java","selenium"));

        String[] splStr = str1.split("!!!");
        System.out.println(splStr[1]);

        String[] splStr1 = str2.split(":",3);       // limit affects the length of resulting array
        System.out.println(splStr1[2]);


        String[] splStr2 = str2.split("!",3);
        System.out.println(splStr2[0]);             // if regexp not matches, no spilt happens, entire string goes to [0] index


//str= Java Class
        System.out.println(str.startsWith("java"));     // case sensitive
        System.out.println(str.startsWith("Class",5));

        System.out.println(str.subSequence(3,6));       // returns CharacterSequence

        System.out.println(str.substring(3));       // returns String
        System.out.println(str.substring(2,5));       // returns String

      //  System.out.println(str);
        char[] ca = str.toCharArray();
        System.out.println(ca[3]);



        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(Locale.getDefault());  //Turkish locale returns "T\u0130TLE", where '\u0130' is the LATIN , "en" (English), "ja" (Japanese), "kok" (Konkani)



        System.out.println(str.toLowerCase(Locale.JAPANESE));


        Integer val=10;
        System.out.println(Integer.toString(12));
        System.out.println(val.toString());

        System.out.println(Integer.toString(12)+val.toString());

        String st = " Hi!Heloo ";
        System.out.println(st.length());
        System.out.println(st.trim().length());  // remove leading and trailing white space

        //char[] chr = {'C','l','a','s','s'};


        int value=30;
        float f = 1;
        Double d = 2.0;
        String s1=String.valueOf(value)+String.valueOf(f)+String.valueOf(d)+String.valueOf(true);

        System.out.println(s1+10+"hi");//concatenating string with 10
  //      System.out.println(true+10);


    /*    System.out.println(st.valueOf('i'));
        System.out.println(st.valueOf(false).getClass());
        System.out.println(st.valueOf("He"));
        System.out.println(st.valueOf(chr));*/











    }
}
