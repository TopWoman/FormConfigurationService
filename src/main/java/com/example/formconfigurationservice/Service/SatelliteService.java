package com.example.formconfigurationservice.Service;

import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Models.Satellite;
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
public class SatelliteService {
    @Autowired
    private final SatelliteRepository satelliteRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Satellite addSatellite(Satellite satellite){
        satelliteRepository.insert(satellite);
        return satellite;
    }
}
