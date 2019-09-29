package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter testAdapter = new MedianAdapter();
        Book book1 = new Book("anonim", "kronika anonima", 1978, "AAA334");
        Book book2 = new Book("mysliciel", "trudne prawdy", 1990, "AAB987");
        Book book3 = new Book("masa", "swiadek koronny powraca", 2019, "WER2070");
        Book book4 = new Book("bestsellerowicz", "opowiescie o nicosci", 2018, "WER0000");
        Book book5 = new Book("malysz", "skok na poczte", 2010, "POL1200");
        //When
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        int medianPublicationYear = testAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(medianPublicationYear);
        Assert.assertEquals(medianPublicationYear, 2010);


    }
}
