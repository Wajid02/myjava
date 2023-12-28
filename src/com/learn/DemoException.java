package com.learn;

public class DemoException {
    public static void main(String[] args) {
        try{
            throw new InvaildUser("Not Eligible for this course");
        }
        catch (InvaildUser invaildUser){
            System.out.println(invaildUser.getMessage());
        }
    }


}
