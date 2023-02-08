package com.steelseries.employeeservice.repository.impl;

import com.steelseries.employeeservice.model.Employee;
import com.steelseries.employeeservice.repository.CustomRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

/**
 * @author Neil
 * @created 08/02/2023 - 9:25 am
 */
public class CustomRepositoryImpl implements CustomRepository {
    /* Created by USER */

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findLike(String email) {

        Query query = entityManager.createQuery("SELECT e FROM Employee e  where e.email = :email");
        query.setParameter("email", email);
        return query.getResultList();
    }
}
