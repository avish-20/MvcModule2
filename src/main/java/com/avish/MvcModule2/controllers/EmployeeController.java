package com.avish.MvcModule2.controllers;

import com.avish.MvcModule2.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    //getMapping with Path AVriable
    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
        return new EmployeeDTO(employeeId, "Avish", "abc@gmail.com", 24, LocalDate.of(2024, 11, 10), true);
    }

    @GetMapping(path ="")
    public String getAllEmployees(@RequestParam(required = false) Integer age) {
        return "Hi age:"+age;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

}
