package com.example.formconfigurationservice.Controller;

import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
import com.example.formconfigurationservice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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



    /*Удаление*/
    @GetMapping(value = "/employeeId/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Deleted Message Successfully: "+ employeeId;
    }

    /*Пойск по ID*/
    @GetMapping("/employeeId/{id}")
    public Optional<Employee> getEmployeeId(@PathVariable String id) {
        return employeeRepository.findById(id);
    }

//    /*Пойск по fornName Д О П И С А Т Ь*/
//    @GetMapping("/getFormName/{fornName}")
//    public Employee getFormName(@PathVariable String fornName) {
//        return employeeService.searchFormName(fornName);
//    }
}
