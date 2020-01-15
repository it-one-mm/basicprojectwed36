package com.itonemm.lib;

import java.util.Scanner;

public class NumberTest {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1st  Number:");
        int a=scanner.nextInt();
        System.out.print("Enter 2nd  Number:");
        int b=scanner.nextInt();
        System.out.print("Enter 3rd  Number:");
        int c=scanner.nextInt();
        System.out.println("Total:"+(a+b+c));
        System.out.println("Average is:"+(a+b+c)/3.0);
    }

}
