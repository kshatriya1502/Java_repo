// strings in the java  :

/*
NOTE :
No, in Java, a String is not a primitive type. It is a non-primitive or reference type. While Java provides convenient ways to work with strings (like primitive types), strings are actually objects of the String class.

Key points:

Strings can be null because they are objects.
String is part of the Java standard library (java.lang.String), and it provides methods to manipulate strings.
Although you can work with strings in a simple way (e.g., "Hello"), internally, they are objects and managed differently than primitive types.

 */

import java.util.Locale;

public class Lec5 {
    public static void main(String[] args) {
        String greet = "hello" ;
        System.out.println(greet);


        /*

        A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example,
        the length of a string can be found with the length() method

        */

        // String length  :
        String txt  = "abcdefghhijklmnopqurstuvwxyz"  ;
        System.out.println(txt.length());

        // uppercase and the lowercase :
        String s = "hello world" ;
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // indexOf() :
        /*
        The indexOf() method returns the index (the position) of the first occurrence
         of a specified text in a string (including whitespace):
         */

        txt = "abccaadeffghijklmnop" ;
        System.out.println(txt.indexOf("a"));
        System.out.println(txt.indexOf("f"));
        System.out.println(txt.indexOf("k"));


        // String concatenation :
        String a = "hello" , b = "shreya" ;
        System.out.println(a + b);

        // using the concat :

        System.out.println(b.concat(a));

        a = "45" ;
        int ab = 10 ;
        System.out.println(a + ab);
        // here ab is integer and get automatically typecasted from the integer to the string and get added into the string.


    }
}
