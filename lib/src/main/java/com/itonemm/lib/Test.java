package com.itonemm.lib;

import java.util.Scanner;

public class Test {

    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter mark:");
        int mark=in.nextInt();
        char ch=in.next().charAt(0);


        if(mark>=0 && mark<=100){



           if(mark>50 && mark<=70)
            {
                System.out.println("C");
            }
           else  if(mark>70 && mark<=80)
           {
               System.out.println("B");
           }
           else if(mark>80 && mark<=90)
           {
               System.out.println("A");
           }
           else if(mark>90 && mark<=100)
           {
               System.out.println("Excellent");
           }
           else
           {
               System.out.println("Fail");
           }



        }
        else
        {
            System.out.println("Not in Range!");
        }
    }

}
