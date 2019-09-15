package com.kodilla.hibernate.manytomany.facade;

public class QueryProcessingException extends Exception {

    public static String ERR_EMPLOYEE_NOTFOUND = "No employee with a lastname consisting of required pattern has been found";
    public static String ERR_COMPANY_NOTFOUND = "No company with a name consisting of required pattern has been found";

    public QueryProcessingException(String message){
        super(message);
    }
}
