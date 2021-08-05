package com.domain;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
    String empId;
    String company;

    public EmployeeBean() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "empId='" + empId + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
