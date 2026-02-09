package com.gla.Arrays;

public class Student {
    int age;
    int rollNo;
    String name;

    public void Printinfo(){
        System.out.println("name is : " + name);
        System.out.println("roll no : " + rollNo);
        System.out.println("age is : " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        int a = s1.age = 19;
        int b = s1.rollNo = 20;
        String c = s1.name = "meow";
        s1.Printinfo();
    }
}