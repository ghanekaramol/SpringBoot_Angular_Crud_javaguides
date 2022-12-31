package com.crud.javaguides.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.javaguides.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}
