package com.company;
import java.util.Scanner;
public class scanner
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name?");
        String a1=sc.nextLine();
        System.out.println("Enter your father name");
        String a2=sc.nextLine();
        System.out.println("Enter your Course:");
        String a3=sc.nextLine();
        System.out.println("Enter your University name:");
        String a7=sc.nextLine();
        System.out.println("Enter your semester Year(Should be a number or integer):");
        int a8= sc.nextInt();
        System.out.println("Enter your obtaining marks:");
        int a4=sc.nextInt();
        System.out.println("Enter your Total marks:");
        int a5=sc.nextInt();
        float a6=(a4*100/a5);
        System.out.println("Your data:");
        System.out.println("Your name is: "+a1);
        System.out.println("Your Father name is: "+a2);
        System.out.println("Your course: "+a3);
        System.out.println("Your University name: "+a7);
        System.out.println("Your semester Year: "+a8);
        System.out.println("Your percentage is: "+a6);

    }
}
