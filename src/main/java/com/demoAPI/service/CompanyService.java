package com.demoAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoAPI.model.Company;
import com.demoAPI.repository.CompanyRepository;

@Service
public class CompanyService {
	 @Autowired
	    private CompanyRepository companyRepository;

	    public List<Company> getCompaniesByEmployeesRange(int minEmployees, int maxEmployees) {
	        return companyRepository.findByEmployeesBetween(minEmployees, maxEmployees);
	    }
	    // other methods
}
