package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private ManytomanyFacade manytomanyFacade;

    @Test
    public void testCompanyQuery() {
        //Given
        Company maszynaDanych = new Company("Maszyna Danych");
        Company centrumPomyslowosci = new Company("Centrum Pomyslowosci");
        Company czarnaDziura = new Company("Czarna Dziura");

        //When
        companyDao.save(maszynaDanych);
        companyDao.save(centrumPomyslowosci);
        companyDao.save(czarnaDziura);

        int maszynaDanychId = maszynaDanych.getId();
        int centrumPomyslowosciId = centrumPomyslowosci.getId();
        int czarnaDziuraId = czarnaDziura.getId();

        List<Company> result = companyDao.retrieveCompaniesWithNameConsisting("%masz%");

        //Then
        Assert.assertEquals(1, result.size());

        //Clean up

        companyDao.deleteById(maszynaDanychId);
        companyDao.deleteById(centrumPomyslowosciId);
        companyDao.deleteById(czarnaDziuraId);
        try {
            companyDao.deleteById(maszynaDanychId);
            companyDao.deleteById(centrumPomyslowosciId);
            companyDao.deleteById(czarnaDziuraId);
        } catch (Exception o) {

        }
    }

    @Test
    public void testEMployeeQuery() {
        //Given
        Employee janKowalski = new Employee("Jan", "Kowalski");
        Employee stefaniaKlarysewicz = new Employee("Stefania", "Klarysewicz");
        Employee lidiaKownacka = new Employee("Lidia", "Kownacka");

        //When
        employeeDao.save(janKowalski);
        employeeDao.save(stefaniaKlarysewicz);
        employeeDao.save(lidiaKownacka);

        int kowalskiId = janKowalski.getId();
        int klarysewiczId = stefaniaKlarysewicz.getId();
        int kownackaId = lidiaKownacka.getId();

        List<Employee> result = employeeDao.retriveEmployeesOfLastnameConsisting("%lar%");

        //Then
        Assert.assertEquals(1, result.size());

        //Clean up
        employeeDao.deleteById(kowalskiId);
        employeeDao.deleteById(klarysewiczId);
        employeeDao.deleteById(kownackaId);
        try {
            employeeDao.deleteById(kowalskiId);
            employeeDao.deleteById(klarysewiczId);
            employeeDao.deleteById(kownackaId);
        } catch (Exception o) {
        }
    }
}


