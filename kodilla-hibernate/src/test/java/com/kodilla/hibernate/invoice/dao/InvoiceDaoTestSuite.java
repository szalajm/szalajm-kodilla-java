package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testSaveInvoiceDaoSave() {
        //Given
        Product mleko = new Product("mleko");
        Product chleb = new Product("chleb");

        BigDecimal price = new BigDecimal("2.5");
        BigDecimal value = new BigDecimal("1.0");

        Item item1 = new Item(mleko, price, 1, value);
        Item item2 = new Item(mleko, price, 2, value);
        Item item3 = new Item(chleb, price, 3, value);
        Item item4 = new Item(chleb, price, 4, value);

        List<Item> itemList1 = new ArrayList<>();
        itemList1.add(item1);
        itemList1.add(item2);
        mleko.setItems(itemList1);

        List<Item> itemList2 = new ArrayList<>();
        itemList2.add(item3);
        itemList2.add(item4);
        chleb.setItems(itemList2);

        Invoice invoice = new Invoice("number one");
        List<Item> itemList3 = new ArrayList<>();
        itemList3.add(item1);
        itemList3.add(item2);
        itemList3.add(item3);
        itemList3.add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        invoice.setItems(itemList3);

        //When
        invoiceDao.save(invoice);
        List<Item> result = invoice.getItems();
        int idToRemove = invoice.getId();

        //Then
        Assert.assertEquals(4, result.size());

         //Clean up

        try {
            invoiceDao.deleteById(idToRemove);
        } catch (Exception e) {
            //do nothing
        }
        }
        }


