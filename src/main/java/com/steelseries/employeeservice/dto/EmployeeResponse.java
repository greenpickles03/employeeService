package com.steelseries.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Neil
 * @created 07/02/2023 - 5:26 pm
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponse {
    /* Created by USER */

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
