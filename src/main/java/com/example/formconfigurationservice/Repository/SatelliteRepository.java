package com.example.formconfigurationservice.Repository;

import com.example.formconfigurationservice.Models.Satellite;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SatelliteRepository extends MongoRepository<Satellite, String> {
}
