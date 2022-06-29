package com.company;

import java.util.*;

public class string_chap {
    /*
    * string is a group of character just like my name is "owais" and it can't be changeable.
    * String is not data type but in java it work as a data type and S should be capital.
    * Just like String name="Owais"; and then print(name);
    * in java Programming Language "printf" is also work and format specifier is also work in java just
      like c language.
    * Like %d, %f ,%c these are the format specifier.
    * instead of printf we can also use format() which works as a printf().
    * escape sequence /n and many other is also work in format specifier.

 ----*Some of the commonly used string method*----

                   01234 thats we called index number
    * String name="Owais";
    ----* That is for length *----
    * name.length()=Return the lenght of string just like owais have 5 character.
            System.out.printf("%d",name.length());
    * The ans will be 5 because there are 5 characters in string;
    * We can also write in this form.
     int namev=name.length();
        System.out.println(namev);
    * The ans will be 5 because there are 5 characters in string;
    ----* That is for toLowercase() *----
    * It returns a new string which has all the lower case character from the string.
    * It convert short form to capital form.
    * String name = "OWAIS";
    *         String lstring = name .toLowerCase();
        System.out.println(lstring);
    * It output will be "owais" in short form.
    ----* That is for touppercase() *----
    * It returns a new string which has all the upper case character from the string.
    * It convert capital form into short form.
    * String name = "OWAIS";
    *         String lstring = name .toUppercase();
        System.out.println(lstring);
    * It output will be "OWAIS" in capital form.


     */
    public static void main(String[] args) {
//        int a=56;
//        float b= 44.44f;
//        System.out.printf("The integer is %d and float is %f ",a,b);
//        System.out.format("\nThe integer is %d and float is %8.2f ",a,b);
        String name = "owais";
//        System.out.printf("%d",name.length());
//        int namev=name.length();
//        System.out.println(namev);
        String lstring = name .toUpperCase();
        System.out.println(lstring);
    }
}
