package com.itonemm.lib;

import java.util.Scanner;

public class IfTest {

    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        char ch;
        int total=0;
        int count=0;
        do {

            System.out.print("Enter an integer:");
            int x=input.nextInt();
            System.out.print("Do you want to exit? (y/n):");
            ch=input.next().charAt(0);
            count++;
            total+=x;

        }while (ch!='y');

        System.out.println("Total:"+total);
        System.out.println("Average:"+((double)total/count));
    }


}
