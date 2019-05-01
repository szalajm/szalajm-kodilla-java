package com.kodilla.stream.stream.reference;

public class FunctionalBeutifier {
    public static String addingABC(String poem) {
        return "ABC" + poem + "ABC";
    }

    public static String convertToLowerCase(String poem) {
    return poem.toLowerCase();
    }

    public static String onePoemOneWord (String poem){
        return poem.trim();
    }

    public static String onlyUs (String poem){
        return poem.valueOf("u");
    }
}

