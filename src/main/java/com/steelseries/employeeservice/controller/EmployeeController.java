package com.steelseries.employeeservice.controller;

import com.steelseries.employeeservice.dto.EmployeeResponse;
import com.steelseries.employeeservice.model.Employee;
import com.steelseries.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Neil
 * @created 08/02/2023 - 8:44 am
 */

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class EmployeeController {
    /* Created by USER */

    private final EmployeeService employeeService;

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public List<Map> addRecord(@RequestBody Employee employee){
        return employeeService.addRecord(employee);
    }

    @RequestMapping(value = "/getAllEmployee", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @RequestMapping(value = "/findLike", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findLike(@Param("email") String email){
        return employeeService.findLike(email);
    }

    @RequestMapping(value = "/getAllRecord", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeResponse> getAllRecord (){
        return employeeService.getAllRecord();
    }

}
