package com.steelseries.employeeservice.repository;

import com.steelseries.employeeservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Neil
 * @created 07/02/2023 - 5:24 pm
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>, CustomRepository {

}
