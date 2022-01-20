package com.example.formconfigurationservice.Repository;

import com.example.formconfigurationservice.Models.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

//    @Query("{fullName:'?0'}")
//    List<Employee> findCustomByFullName(String fullName);
//    List<Employee> satellite(String fullSatellite);
//
//    List<Employee> fields(String fullFields);

}
