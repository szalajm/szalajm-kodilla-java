package com.kodilla.patterns2.facade.api;

public class ItemDto {
    private final Long itemId;
    private final double quantity;

    public ItemDto(Long itemId, double quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return itemId;
    }

    public double getQuantity() {
        return quantity;
    }
}
