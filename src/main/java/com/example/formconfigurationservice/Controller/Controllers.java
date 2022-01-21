package com.example.formconfigurationservice.Controller;

import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
import com.example.formconfigurationservice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controllers {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Controllers(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*Добавление*/
    @PostMapping("/add")
    public ResponseEntity<Employee> addDevice(@RequestBody Employee newEmployee) throws Exception {
        Employee employee = employeeService.addEmployee(newEmployee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    /*Чтение*/
    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeService.detAllEmployee();
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee  employee, @PathVariable String id) {
        employee.setId(id);
        employeeRepository.save(employee);
        return  employee;
    }

    /*Удаление по ID*/
    @DeleteMapping(value = "/employeeDeleteId/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Deleted Message Successfully: "+ employeeId;
    }

    /*Удаление ALL*/
    @DeleteMapping(value = "/employeeDeleteAll")
    public ResponseEntity<Employee> deleteEmployeeAll() {
        employeeRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /*Пойск по ID*/
    @GetMapping("/employeeId/{id}")
    public Optional<Employee> getEmployeeId(@PathVariable String id) {
        return employeeRepository.findById(id);
    }

    /*Пойск по formName*/
    @GetMapping("/getFormName/{formName}")
    public List<Employee> getFormName(@PathVariable String formName) {
            return employeeService.formNameSearch(formName);
    }
}
