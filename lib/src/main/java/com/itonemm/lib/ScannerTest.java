package com.itonemm.lib;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);


        System.out.print("Enter Double Value:");
        double x=in.nextDouble();
        System.out.println(x);


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name=sc.nextLine();
        System.out.println(name);


        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);
        System.out.println("Character is:"+ch);

    }

}
