package com.codecool.crudpractice.employees.repository;

import com.codecool.crudpractice.employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
