package com.itonemm.lib;

import java.util.ArrayList;

public class Student {
    String studentName;
    int age;
    String gender;
    String color;

    public Student(String studentName, int age, String gender, String color) {
       this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public Student() {
    }




    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public void eat(String foodamount)
    {
        System.out.println(studentName+foodamount);

    }

    public  void run(String speed)
    {
        System.out.println(studentName+" "+speed);
    }

    public void drink(String litre)
    {
        System.out.println(studentName+" "+ litre);
    }

    public static void main(String[]args)
    {
        Student student1=new Student("John",13,"male","White");
         Student student2=new Student("Julia",13,"male","White");

        ArrayList<Student> arrayList=new ArrayList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);

        for(int i=0;i<arrayList.size();i++)
        {
            Student temp=arrayList.get(i);
            System.out.println(temp.studentName);
            System.out.println(temp.age);
        }





    }

}
