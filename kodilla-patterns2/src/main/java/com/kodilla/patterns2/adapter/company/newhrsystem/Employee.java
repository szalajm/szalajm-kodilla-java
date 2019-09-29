package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String peselId;
    final private String fistname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String fistname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.fistname = fistname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFistname() {
        return fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(peselId, employee.peselId) &&
                Objects.equals(fistname, employee.fistname) &&
                Objects.equals(lastname, employee.lastname) &&
                Objects.equals(baseSalary, employee.baseSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peselId, fistname, lastname, baseSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", fistname='" + fistname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
