package com.example.formconfigurationservice.Repository;

import com.example.formconfigurationservice.Models.Fields;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FieldsRepository extends MongoRepository<Fields, String> {
}
