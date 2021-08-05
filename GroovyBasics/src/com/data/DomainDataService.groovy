package com.data;

import com.domain.Employee;


public class DomainDataService {
    static List<Employee> getData() {
        Arrays.asList(
                new Employee(firstName: "John", lastName: "Hopkin", ssn: 100, empid: 'E001', company: "ABC"),
                new Employee(firstName: "Dan", lastName: "Tom", ssn: 101, empid: 'E002', company: "EFG"),
                new Employee(firstName: "Ram", lastName: "Singh", ssn: 102, empid: 'E003', company: "HIJ"),
                new Employee(firstName: "Alex", lastName: "Robert", ssn: 103, empid: 'E004', company: "KLM"),
                new Employee(firstName: "Rick", lastName: "James", ssn: 104, empid: 'E005', company: "OPQ"),
                new Employee(firstName: "Mike", lastName: "Rickdic", ssn: 105, empid: 'E006', company: "RST"),
                new Employee(firstName: "Mict", lastName: "Xya", ssn: 106, empid: 'E007', company: "UVW"),
                new Employee(firstName: "Max", lastName: "Sca", ssn: 107, empid: 'E008', company: "XYZ"),
                new Employee(firstName: "Mac", lastName: "Gain", ssn: 108, empid: 'E000', company: "NIC"),
                new Employee(firstName: "Ben", lastName: "Thomas", ssn: 109, empid: 'E010', company: "ABB"),
        );
    }
}
