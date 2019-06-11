package com.kodilla.good.patterns.challanges;

public class ProductOrderService {

    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public ProductOrderService(final InformationService informationService, final SaleService saleService, final SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public SaleDto process (final SaleRequest saleRequest){
        boolean isSold = saleService.sale(saleRequest.getCustomer(), saleRequest.getProduct(), saleRequest.getDelivery());

        if(isSold) {
            informationService.inform();
            saleRepository.createSale(saleRequest.getCustomer(), saleRequest.getProduct());
            return new SaleDto(saleRequest.getCustomer(), true);
        } else {
            return new SaleDto(saleRequest.getCustomer(), false);
        }
    }
}
