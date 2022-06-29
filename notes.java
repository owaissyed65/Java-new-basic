import java.util.*;

public class notes {
    public static void main(String[] args) {
        // notes

        /*
  -----How to take data from user ?----
The ans is that first import import java.util.Scanner; , and then use function of scanner in main Like this
Scanner sc=new Scanner(System.in);
.hasNextInt(); is used for boolean true or false.
for take integer from user used this/
int a= sc.nextInt();
for take string from user used this ,string letter should be capital.
String b=sc.nextLine();
That is the method to take data from user in a form of string,integer,float etc
bitwise operator can save data in binary form.

    ----Operator----
There are 5 types of opertor in every language
1.Arithematic (+,-,*,/)
2.Assignment (=,+=,*=,/=,-=)
3.Comparison (==,<=,>=)
4.Logical (&&,||,!)
5.Bitwise (&,!)

    ----Precedence & Associativity----
precedence int a = 6*5 - 34/2;
 30 -34/2
 30-17
 13
System.out.println(a);
associativity int b= 60/5- 34*2
12 - 78
-56
if u want to see precedence & associativity just goto code with harry with
video name of Precedence & Associativity.
() this have high precedence 14
b*b - a * c / 2 * a
it give another ans because compiler look precendences just like and move to left to right
but if u use parasenthesis()
the ans should be different
logical operator Associativity is right to left just like a=b=4;

    ----Data type and its resulting value----
Resulting Data type after short value
b=byte
s=short
l=long
d=double
f=float
R = b + s --> int
R = s + i --> int
R = c + i --> int
R = c + s --> int
R = l + f --> float
R = i + f --> float
R = l + d --> double
R = f + d --> double

    ----Increament & Decreament Operator----
suppose i=56;
i++; if ++ is after i thats means that i is first used and then increament is done and if i is
used after ++ its mean that first increament done in i .
System.out.println(i); that is increament and the final ans is 57 .
        char a ='c';
        System.out.println(++a);
        the ans is d becuase it increament first and then print a .

        */
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Name");
//        String name= sc.next();
//        System.out.println(name);
//        System.out.println("Enter Number in point");
//        float a= sc.nextFloat();
//        System.out.println("Your Number "+a);
//        System.out.println("Enter Number in Integer");
//        int b= sc.nextInt();
//        System.out.println("Your Number in integer "+b);
       /*
        increament
        int i=0;
        i++;
        System.out.println(i);
        char a ='c';
        System.out.println(++a);
            */

    }
}
