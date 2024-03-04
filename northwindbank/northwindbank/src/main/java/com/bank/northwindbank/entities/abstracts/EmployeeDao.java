package com.bank.northwindbank.entities.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.northwindbank.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
