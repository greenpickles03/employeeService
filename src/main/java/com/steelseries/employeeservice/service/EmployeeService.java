package com.steelseries.employeeservice.service;

import com.steelseries.employeeservice.dto.EmployeeRequest;
import com.steelseries.employeeservice.dto.EmployeeResponse;
import com.steelseries.employeeservice.model.Employee;
import com.steelseries.employeeservice.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Neil
 * @created 07/02/2023 - 5:26 pm
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {
    /* Created by USER */

    private final EmployeeRepository employeeRepository;

    public List<Map> addRecord(Employee employee){
        List<Map> resList = new ArrayList<>();
        Map resMap = new HashMap();
        try{
            employeeRepository.save(employee);
            resMap.put("resMessage", "Success");
            resMap.put("resStatus", 1);
        }catch (Exception ex){
            resMap.put("resMessage", "Field");
            resMap.put("resStatus", 0);
        }
        resList.add(resMap);
        return resList;
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll()
                .stream()
                .collect(Collectors.toList());
    }

    public List<Employee> findLike(String email){
        return employeeRepository.findLike(email)
                .stream()
                .collect(Collectors.toList());
    }

    public List<EmployeeResponse> getAllRecord(){
        return employeeRepository.findAll()
                .stream()
                .map(employee -> EmployeeResponse.builder()
                        .id(employee.getId())
                        .firstName(employee.getFirstName())
                        .lastName(employee.getLastName())
                        .email(employee.getEmail()).build()).toList();
    }

}
