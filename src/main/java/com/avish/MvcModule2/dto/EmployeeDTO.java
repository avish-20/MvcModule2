package com.avish.MvcModule2.dto;

import com.avish.MvcModule2.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class EmployeeDTO {
    Long id;

    @NotBlank(message = "Name of the employee cannot be blank")
    @Size(min = 3, max = 10, message = "Number of characters in name range{3,10}")
    String name;

    @NotBlank(message = "email can not be blank")
    @Email(message = "Please enter valid email")
    String email;

    @NotNull(message = "Age of the employee cannot be blank")
    @Max(value = 80, message = "Age of Employee cannot be greater than 80")
    @Min(value = 18, message = "Age of Employee cannot be less than 18")
    Integer age;

    @NotBlank(message = "Role of the employee cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$", message = "Role of Employee can either be USER or ADMIN"
    @EmployeeRoleValidation
    private String role; //ADMIN, USER

    @NotNull(message = "Salary of Employee should be not null")
    @Positive(message = "Salary of Employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "The salary can be in the form XXXXX.YY")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "DateOfJoining field in Employee cannot be in the future")
    LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    Boolean isActive;
}
