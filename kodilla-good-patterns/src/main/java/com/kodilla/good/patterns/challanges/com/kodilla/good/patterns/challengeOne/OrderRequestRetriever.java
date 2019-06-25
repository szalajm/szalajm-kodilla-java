package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderRequestRetriever {

    public OrderRequest retrieveExtraFoodShop() {

        Product product = new Product("sojowa cielecina, paczka - 50g", 2.0);
        Provider provider = new Provider("ExtraFoodShop");

        return new OrderRequest(provider, product);
    }

    public OrderRequest retrieveGlutenFreeShop() {

        Product product = new Product("mleko sosnowe, butelka 2l", 5.0);
        Provider provider = new Provider("GlutenFreeShop");

        return new OrderRequest(provider, product);
    }

    public OrderRequest retrieveHealthyShop() {

        Product product = new Product("Kielbasa torunska z kielkow pokrzywy", 4.0);
        Provider provider = new Provider("HealthyShop");

        return new OrderRequest(provider, product);
    }
}
