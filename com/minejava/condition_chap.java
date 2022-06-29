package com.minejava;
import java.util.*;
public class condition_chap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Your age: ");
        int a = input.nextInt();
        boolean cond = (a>=18);
        if (cond){
            System.out.println("You are a good boy :)");
        }
        else
        {
            System.out.println("You are not good boy!");
        }
    }
}
