package com.example.formconfigurationservice.Service;

//import com.example.formconfigurationservice.Repository.EmployeeDao;
//import com.example.formconfigurationservice.EmployeeNotFoundException;
import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Models.Satellite;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
//import com.example.formconfigurationservice.Repository.SatelliteRep;
import com.example.formconfigurationservice.Repository.SatelliteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeService {

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

    public List<Employee> idSearch(String id)
    {
        Query query = new Query();
        query.addCriteria(Criteria.where("satellite.id").is(id));
        return mongoTemplate.find(query, Employee.class);
    }

}
