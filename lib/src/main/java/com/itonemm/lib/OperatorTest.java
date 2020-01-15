package com.itonemm.lib;

public class OperatorTest {


    public static void main(String[]args)
    {
        int a=5,b=2,c=1;

        int m=a++*5;
        System.out.println("M is:"+m);


        int x=10,y=2;


        int p=2;

        p*=x/y;//p=p*x/y


        System.out.println("P is:"+p);

        int s=5;
        s/=5;
        System.out.println("S is: "+s);


        int n=b++-c*2;

        System.out.println("N is:"+n);

        System.out.println("B is :"+b);


        System.out.println(5/2);

        System.out.println(5/2.0);

    }
}
