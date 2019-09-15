package com.springjpaseptdemo.springjpaseptdemo.repository;

import com.springjpaseptdemo.springjpaseptdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
