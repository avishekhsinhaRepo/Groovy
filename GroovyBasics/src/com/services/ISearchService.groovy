package com.services

import com.domain.Employee
import com.domain.Person

interface ISearchService {
    List findAll();

    Employee findBySsn(int ssn);
}