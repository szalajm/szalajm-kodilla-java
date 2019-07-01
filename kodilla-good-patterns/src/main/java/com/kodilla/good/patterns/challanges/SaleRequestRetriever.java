package com.kodilla.good.patterns.challanges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        Customer customer = new Customer("Marian Koniuszko");
        Product product = new Product("Wykałaczki gumowe");
        Delivery delivery = new Delivery("InPost", "Kosmiczna 10, 09-100 Wachock");

        return new SaleRequest(customer, product, delivery);
    }
}
