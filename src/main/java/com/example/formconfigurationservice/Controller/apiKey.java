package com.example.formconfigurationservice.Controller;

import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Models.Fields;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
import com.example.formconfigurationservice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class apiKey {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    public apiKey(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*Добавление*/
    @PostMapping("/asdddd")
    public ResponseEntity<Employee> addDevice(@RequestBody Employee newEmployee) throws Exception {
        Employee employee = employeeService.addEmployee(newEmployee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

//    /*Чтение*/
//    @GetMapping("/allKey")
//    public ResponseEntity<Fields> getAllKey( @PathVariable Fields fields) {
//        List<Fields> allKey = new ArrayList<Fields>();
//
//        return new ResponseEntity<>((Fields) allKey, HttpStatus.CREATED);
//    }

}
