package com.kodilla.stream;

import com.kodilla.stream.beutifier.PoemBeutifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalBeutifier;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeutifier poemBeutifier = new PoemBeutifier();

        System.out.println("Calculating expressions with lambdas");
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", poem -> "ABC" + poem + "ABC" );
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", poem -> poem.toLowerCase());
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", poem -> poem.trim());
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", poem -> poem.valueOf("u"));

        System.out.println("Calculating expressions with method references");

        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", FunctionalBeutifier::addingABC);
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", FunctionalBeutifier::convertToLowerCase);
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", FunctionalBeutifier::onePoemOneWord);
        poemBeutifier.beutify("Nad Mazowsza równiną otwartą", FunctionalBeutifier::onlyUs);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }

    }


