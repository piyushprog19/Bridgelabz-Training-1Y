package com.gla.constructors;

public class test {
    public static void arithExcep(int age) throws ArithmeticException,NullPointerException{
        if(age<18){
            throw new ArithmeticException("invalid age");
        }
        System.out.println("valid age");
    }

    static void main(String[] args) {
        try {
            arithExcep(100);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}