package com.company;

public class string1_chap {
   /*

    * String name = "    Owais    ";
    * name.trim();
    * Returns a new string after removing all the new leading and trailing spaces from the original string.
    * It output should be without spacing.
    * Just Like this Owais.
    * String name ="Owais"
    * name.Substring(int start,int end);
    * Return a Substring from start and end string is included.
    * String name = "owais";
    * System.out.println(name.substring(1,3));
    * It output should by 'wa' because it start from index number 1 and end in index 3 but end is excluded.
    * String name = "Harry";
    * name.replace(oldchar,newchar);
    * System.out.println(name.replace('r','p'));
    * It Output should be "Happy" because it replaced r from p.
    * System.out.println(name.replace("rry","ier"));
    * It ouput should be "Haier" because it replaced word
    * String name = "owais";
    * name.startswith();
    * It return in boolean language just like if it start from "ow" it gives true else it gives false and
      also same with name.endsWith(); it look end char of string just like "is" and give according to the
      string if it ture then output will also true.
    * name.charAt(int of index num of string);
    * It output should be according to the index number.
    * name.indexof("char ",int) it search and give index number.
    * name.lastindexof("char",int) search to last of string.








    */
    public static void main(String[] args) {
//            String name = "   owais    ";
//       System.out.println(name.trim());
        String name = "owaisweis";
//        System.out.println(name.substring(1,3));
//        String name = "Harry";
//        System.out.println(name.replace("rry","ier"));
//        System.out.println(name.replace('r','p'));
//        System.out.println(name.startsWith("ow"));
//        System.out.println(name.endsWith("i"));
//        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("wa",1));
        System.out.println(name.lastIndexOf("we",8));
    }
}


