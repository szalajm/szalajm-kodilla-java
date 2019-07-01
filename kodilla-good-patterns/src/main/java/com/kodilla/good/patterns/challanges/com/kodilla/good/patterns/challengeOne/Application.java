package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Application {
    public static void main(String args[]) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderExtraFoodShop = orderRequestRetriever.retrieveExtraFoodShop();
        OrderRequest orderGlutenFreeShop = orderRequestRetriever.retrieveGlutenFreeShop();
        OrderRequest orderHealthyShop = orderRequestRetriever.retrieveHealthyShop();

        OrderProcessorExtraFoodShop orderProcessorExtraFoodShop = new OrderProcessorExtraFoodShop(new OrderServiceExtraFoodShop(), new InformationServiceExtraFoodShop());
        orderProcessorExtraFoodShop.process(orderExtraFoodShop);

        OrderProcessorGlutenFreeShop orderProcessorGlutenFreeShop = new OrderProcessorGlutenFreeShop(new OrderServiceGlutenFreeShop(), new InformationServiceGlutenFreeShop());
        orderProcessorGlutenFreeShop.process(orderGlutenFreeShop);

        OrderProcessorHealthyShop orderProcessorHealthyShop = new OrderProcessorHealthyShop(new OrderServiceHealthyShop(), new InformationServiceHealthyShopAccept(), new InformationServiceHealthyShopNotAccepted());
        orderProcessorHealthyShop.process(orderHealthyShop);

    }
}
