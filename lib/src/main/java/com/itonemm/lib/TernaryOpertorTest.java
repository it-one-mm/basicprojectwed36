package com.itonemm.lib;

public class TernaryOpertorTest {

    public static void main(String[]args)
    {
        int a=20,b=10,c=30,result;


        result= (
                        (a>b)?
                        (a>c)?a:c:
                                (b>c)?b:c
                );

        System.out.println("The Max of three numbers:"+result);
    }

}
