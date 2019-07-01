package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderProcessorExtraFoodShop implements OrderProcessor {

    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessorExtraFoodShop(OrderService orderService, InformationService informationService) {
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProvider(), orderRequest.getProduct());

        if (isOrdered) {
            informationService.inform();
            return new OrderDto(orderRequest.getProvider(), true);
        } else {
            return new OrderDto(orderRequest.getProvider(), false);
        }
    }
}
