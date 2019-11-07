package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49), 5.0));
        //Then

        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.01);
    }

    @Test
    public void testGetItemValue(){
        //Given
        SimpleItem itemOne = new SimpleItem(new SimpleProduct("Product 1", 10.20), 20);
        SimpleItem itemTwo = new SimpleItem(new SimpleProduct("Product 2", 10.10),20);
        SimpleItem itemThree = new SimpleItem(new SimpleProduct("Product 3", 80.10), 20);

        SimpleInvoice invoice = new SimpleInvoice();
        invoice.addItem(itemOne);
        invoice.addItem(itemTwo);
        invoice.addItem(itemThree);

        List<SimpleItem> items = invoice.getItems();

        //When
        for(SimpleItem item : items){
            Double value = item.getValue();
            System.out.println(value);
        }

        //Then
        Assert.assertEquals(3, items.size());

    }
}
