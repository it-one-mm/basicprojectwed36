package com.itonemm.lib;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[]args)
    {


        /*int intArr1[]=new int[]{1,2,3,5,89};

        for(int index=0;index<intArr1.length;index++)
        {
            System.out.println(intArr1[index]);
        }*/

        int arr[]=new int[5];
        for(int index=0;index<arr.length;index++)
        {
            arr[index]=(index+1)*10;
            System.out.println(arr[index]);
        }


        ArrayList<Integer>  integerArrayList=new ArrayList<Integer>();
        integerArrayList.add(56);
        integerArrayList.add(300);

        for(int i=0;i<integerArrayList.size();i++)
        {
            integerArrayList.get(i);
        }

    }

}
