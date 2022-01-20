package com.example.formconfigurationservice.Service;

//import com.example.formconfigurationservice.Repository.EmployeeDao;
//import com.example.formconfigurationservice.EmployeeNotFoundException;
import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeService {

//    private final EmployeeDao employeeDao;

    private final EmployeeRepository employeeRepository;

    public List<Employee> detAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee){
        employeeRepository.insert(employee);
        return employee;
    }

//    public Employee deleteEmployee(String id){
//        return employeeRepository.deleteAllById(id);
//    }

//    public void deleteEmployee(String id) {
//        Employee employee = employeeDao.getProfileById(id)
//                .orElseThrow(() -> new EmployeeNotFoundException(id));
//        employeeDao.deleteEmployeeById(employee.getId());
//    }

//    public Employee searchFormName(String formName) {
//        Employee employee = employeeDao.getEmployeeByFormName(formName)
//                .orElseThrow(() -> new EmployeeNotFoundException(formName));
//        employeeDao.insertEmployee(employee.getFormName(formName));
//        return employee;
//    }

}
