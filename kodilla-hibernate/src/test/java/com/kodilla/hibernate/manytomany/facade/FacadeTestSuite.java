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
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        int softwareMachineId = softwareMachine.getId();
        int dataMasterId = dataMaesters.getId();
        int greyMatterId = greyMatter.getId();

        List<Company> result = companyDao.retrieveCompaniesWithNameConsisting("%dat%");

        //Then
        Assert.assertEquals(1, result.size());

        //Clean up
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMasterId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception o) {

        }
    }

    @Test
    public void testEMployeeQuery() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        int smithId = johnSmith.getId();
        int clarksonId = stephanieClarckson.getId();
        int kovalskyId = lindaKovalsky.getId();

        List<Employee> result = employeeDao.retriveEmployeesOfLastnameConsisting("%mit%");

        //Then
        Assert.assertEquals(1, result.size());

        //Clean up
        try {
            employeeDao.deleteById(smithId);
            employeeDao.deleteById(clarksonId);
            employeeDao.deleteById(kovalskyId);
        } catch (Exception o) {
        }
    }
}

