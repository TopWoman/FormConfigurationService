package com.example.formconfigurationservice.Repository;

import com.example.formconfigurationservice.Models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
