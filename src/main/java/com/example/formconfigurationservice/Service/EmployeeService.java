package com.example.formconfigurationservice.Service;

//import com.example.formconfigurationservice.Repository.EmployeeDao;
//import com.example.formconfigurationservice.EmployeeNotFoundException;
import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeService {

//    private final EmployeeDao employeeDao;
    @Autowired
    private MongoTemplate mongoTemplate;

    private final EmployeeRepository employeeRepository;

    public List<Employee> detAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee){
        employeeRepository.insert(employee);
        return employee;
    }

    public List<Employee> formNameSearch(String formName)
    {
        Query query = new Query();
        query.addCriteria(Criteria.where("formName").is(formName));
        return mongoTemplate.find(query, Employee.class);
    }

//    public Employee update(Employee employee){
//        Query query = new Query();
//        query.addCriteria(Criteria.where("id").is(employee.getId()));
//        Update update = new Update();
//        update.set("formName", employee.getFormName());
//        update.set("label", employee.getLabel());
//        return mongoTemplate.findAndModify(query, update, Employee.class);
//    }


//    public String findCustomByFullName(String fornName) {
//        employeeRepository.insert(fornName);
//        return fornName;
//    }

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
