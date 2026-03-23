package com.gla.constructors;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}
public class CustomException{
static void ageChecker(int age) throws InvalidAgeException{
    if(age<18){
        throw new InvalidAgeException("Age is invalid for voting");

    }
    System.out.print("valid age for voting");
}

    static void main(String[] args) {
        try{
            ageChecker(15);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }

}





