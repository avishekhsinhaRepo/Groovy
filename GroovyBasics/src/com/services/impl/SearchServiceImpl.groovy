package com.services.impl

import com.data.DomainDataService
import com.domain.Employee;
import com.domain.Person
import com.services.ISearchService;


public class SearchServiceImpl implements ISearchService {
    private static final List<Employee> employeeList = DomainDataService.getData();
    @Override
    List findAll() {
        employeeList
    }

    @Override
    Employee findBySsn(int ssn) {
        employeeList.findAll({emp -> emp.ssn == ssn}).first();
    }
}
