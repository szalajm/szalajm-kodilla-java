package com.kodilla.patterns2.facade.api;

import java.awt.*;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION__ERROR = "Verification error";
    public static String ERR_SUBMITTING_ERROR = "Cannot submit error";

    public OrderProcessingException (String message){
        super(message);
    }
}
