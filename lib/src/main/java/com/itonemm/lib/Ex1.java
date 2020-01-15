package com.itonemm.lib;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[]args)
    {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=input.nextInt();

        for(int i=0;i<rows;i++){
           for(int j=0;j<=i;j++)
           {
               System.out.print("* ");
           }
            System.out.println();
        }
    }

}
