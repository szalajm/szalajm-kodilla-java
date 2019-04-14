package com.kodilla.testing;

import calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result1 = simpleUser.getUsername();

        if(result1.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int result2 = calculator.add(70,30);
        int result3 = calculator.substract(70,30);

        if(result2 == 100 && result3== 40) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
