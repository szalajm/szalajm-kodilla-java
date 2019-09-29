package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }
}

//    @Test
//   public void testQueries() {
  //      //Given
     //   Employee johnSmith = new Employee("John", "Smith");
       // Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        //Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //Company softwareMachine = new Company("Software Machine");
        //Company dataMaesters = new Company("Data Maesters");
        //Company greyMatter = new Company("Grey Matter");

        //softwareMachine.getEmployees().add(johnSmith);
        //dataMaesters.getEmployees().add(stephanieClarckson);
        //dataMaesters.getEmployees().add(lindaKovalsky);
        //greyMatter.getEmployees().add(johnSmith);
        //greyMatter.getEmployees().add(lindaKovalsky);

        //johnSmith.getCompanies().add(softwareMachine);
        //johnSmith.getCompanies().add(greyMatter);
        //stephanieClarckson.getCompanies().add(dataMaesters);
        //lindaKovalsky.getCompanies().add(dataMaesters);
        //lindaKovalsky.getCompanies().add(greyMatter);

        //companyDao.save(softwareMachine);
        //companyDao.save(dataMaesters);
        //companyDao.save(greyMatter);

        //employeeDao.save(johnSmith);
        //employeeDao.save(stephanieClarckson);
        //employeeDao.save(lindaKovalsky);

        //int softwareMachineId = softwareMachine.getId();
        //int dataMasterId = dataMaesters.getId();
        //int greyMatterId = greyMatter.getId();

        //int smithId = johnSmith.getId();
        //int clarksonId = stephanieClarckson.getId();
        //int kovalskyId = lindaKovalsky.getId();

        // When
        //List<Employee> kovalskyList = employeeDao.retrieveEmployeesOfCertainLastname("Kovalsky");
        //List<Company> datList = companyDao.retrieveCompaniesWithNameStartingWith("dat");

        //Then
        //Assert.assertEquals(1, kovalskyList.size());
        //Assert.assertEquals(1, datList.size());

        //Clean up
        //try {

          //  companyDao.deleteById(softwareMachineId);
           // companyDao.deleteById(dataMasterId);
            //companyDao.deleteById(greyMatterId);
            //employeeDao.deleteById(smithId);
            //employeeDao.deleteById(clarksonId);
            //employeeDao.deleteById(kovalskyId);

        //} catch (EmptyResultDataAccessException ex) {
            //do nothing
   //     }
    //}
//}


//
