package com.avish.MvcModule2.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDTO {
    Long id;
    
    String name;

    String email;

    Integer age;

    LocalDate dateOfJoining;

    Boolean isActive;
}
