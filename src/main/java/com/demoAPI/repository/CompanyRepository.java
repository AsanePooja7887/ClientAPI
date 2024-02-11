package com.demoAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoAPI.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByEmployeesBetween(int minEmployees, int maxEmployees);
}
