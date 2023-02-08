package com.steelseries.employeeservice.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Neil
 * @created 07/02/2023 - 5:22 pm
 */
@Entity
@Getter
@Setter
@Table(name = "employee_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    /* Created by USER */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
