package com.itonemm.lib;

public class FindMax {
    public static void main(String[]args)
    {
        int x=10;
        int y=11;


        sayhello("0989899","Hsu Hsu");


    }

    public static int findMax(int num1,int num2)
    {
        if(num1>num2)
        {
            return num1;
        }
        else{
           return  num2;
        }


    }


    public static  void sayhello(String phonenumber,String name)
    {
        System.out.println("Phone Number"+phonenumber);
        System.out.println("Name:"+name);
    }

}
