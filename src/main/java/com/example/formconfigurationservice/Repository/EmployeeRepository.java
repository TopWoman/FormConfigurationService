package com.example.formconfigurationservice.Repository;

import com.example.formconfigurationservice.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
//      @Query("{formName:'?0'}")
//      List<Employee> formNameSearch(String fullName);
//    @Query("{fullName:'?0'}")
//    List<Employee> satellite(String fullSatellite);
//    List<Employee> fields(String fullFields);

}
