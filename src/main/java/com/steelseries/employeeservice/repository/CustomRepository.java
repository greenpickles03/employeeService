package com.steelseries.employeeservice.repository;

import com.steelseries.employeeservice.model.Employee;

import java.util.List;

/**
 * @author Neil
 * @created 08/02/2023 - 9:22 am
 */
public interface CustomRepository {
    /* Created by USER */

    List<Employee> findLike(String email);
}
