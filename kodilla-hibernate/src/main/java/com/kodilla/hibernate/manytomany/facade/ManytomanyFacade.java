package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManytomanyFacade {
    @Autowired
    private Employee employee;
    @Autowired
    private Company company;
    @Autowired
    private  EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER= LoggerFactory.getLogger(ManytomanyFacade.class);

    public void processEmployeeQuery(String arg) throws QueryProcessingException{
        List<Employee> result = employeeDao.retriveEmployeesOfLastnameConsisting("%" + arg + "%");
        LOGGER.info("Browsing for employees whose lastnames include: " + arg);
        if(result.isEmpty()){
            LOGGER.error(QueryProcessingException.ERR_EMPLOYEE_NOTFOUND);
            throw new QueryProcessingException(QueryProcessingException.ERR_EMPLOYEE_NOTFOUND);
        }
        System.out.println("Employees You are searching for are: " + result);
    }

    public void processCompanyQuery(String arg) throws QueryProcessingException{
        List<Company> result = companyDao.retrieveCompaniesWithNameConsisting("%" + arg + "%");
        LOGGER.info("Browsing for companies whose names include: " + arg);
        if(result.isEmpty()){
            LOGGER.error(QueryProcessingException.ERR_COMPANY_NOTFOUND);
            throw new QueryProcessingException(QueryProcessingException.ERR_COMPANY_NOTFOUND);
        }
        System.out.println("Companies You are searching for are: " + result);
    }
}
