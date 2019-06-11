package com.kodilla.good.patterns.challanges;

public class Application {
    public static void main(String[] args) {

        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = saleRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceImplemented(), new SaleServiceImplemented(), new SaleRepositoryImplemented());
        productOrderService.process(saleRequest);

    }
}
