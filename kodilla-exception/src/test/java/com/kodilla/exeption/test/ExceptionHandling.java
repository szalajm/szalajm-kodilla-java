package com.kodilla.exeption.test;


public class ExceptionHandling {

public static void main (String[] args) {

    SecondChallenge secondChallenge = new SecondChallenge();

    try {
        secondChallenge.probablyIWillThrowException(3, 1.5);
    } catch (Exception e) {
        System.out.println("Exception has occured:" + e);
    } finally {
        System.out.println("Be aware of argument values");
    }

    }
}