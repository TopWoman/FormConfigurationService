package com.example.formconfigurationservice.Service;

import com.example.formconfigurationservice.Models.Satellite;
import com.example.formconfigurationservice.Repository.SatelliteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SatelliteService {
    @Autowired
    private final SatelliteRepository satelliteRepository;

    public Satellite addSatellite(Satellite satellite){
        satelliteRepository.insert(satellite);
        return satellite;
    }
}
