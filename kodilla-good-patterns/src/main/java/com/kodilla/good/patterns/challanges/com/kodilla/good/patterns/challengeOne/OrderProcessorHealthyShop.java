package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderProcessorHealthyShop implements OrderProcessor {

    private OrderService orderService;
    private InformationService informationServiceAccepted = new InformationServiceHealthyShopAccept();
    private InformationService informationServiceNotAccepted = new InformationServiceHealthyShopNotAccepted();


    public OrderProcessorHealthyShop(OrderService orderService, InformationService informationServiceAccepted, InformationService informationServiceNotAccepted) {
        this.orderService = orderService;
        this.informationServiceAccepted = informationServiceAccepted;
        this.informationServiceNotAccepted = informationServiceNotAccepted;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProvider(), orderRequest.getProduct());

        if (isOrdered) {
            informationServiceAccepted.inform();
            return new OrderDto(orderRequest.getProvider(), true);
        } else {
            informationServiceNotAccepted.inform();
            return new OrderDto(orderRequest.getProvider(), false);
        }
    }
}
