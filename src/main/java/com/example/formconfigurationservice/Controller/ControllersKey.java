//package com.example.formconfigurationservice.Controller;
//
//import com.example.formconfigurationservice.Models.Employee;
//import com.example.formconfigurationservice.Models.Fields;
//import com.example.formconfigurationservice.Models.Satellite;
//import com.example.formconfigurationservice.Repository.FieldsRepository;
//import com.example.formconfigurationservice.Repository.SatelliteRepository;
//import com.example.formconfigurationservice.Service.FieldsService;
//import com.example.formconfigurationservice.Service.SatelliteService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class ControllersKey {
//
//    private static Logger logger = LoggerFactory.getLogger(Controllers.class);
//
//    List<String> list = new ArrayList<>();  //Ключи для словаря satellite
//    List<String> list1 = new ArrayList<>(); //Ключи для словаря fields
//
//    @Autowired
//    private SatelliteRepository satelliteRepository;
//
//    @Autowired
//    private FieldsRepository fieldsRepository;
//
//    @Autowired
//    private SatelliteService satelliteService;
//    @Autowired
//    private FieldsService fieldsService;
//    public ControllersKey(SatelliteService satelliteService, FieldsService fieldsService) {
//        this.satelliteService = satelliteService;
//        this.fieldsService = fieldsService;
//    }
//
//    /*Добавление*/
//    @PostMapping("/newSatellite")
//    public ResponseEntity<Satellite> aSatellite(@RequestBody Satellite newSatellite) {
//        logger.info("Received new satellite: " + newSatellite.getSatelliteType() + " " + newSatellite.getSatelliteClassifier());
//        list.add(newSatellite.getSatelliteType().keySet().toString() + newSatellite.getSatelliteClassifier().keySet());
//        Satellite satellite = satelliteService.addSatellite(newSatellite);
//        return ResponseEntity.ok(satellite);
//    }
//
//    //    /*Добавление*/
////    @PostMapping("/satellite")
////    public ResponseEntity<Satellite> addSatellite(@RequestBody Satellite satellite) {
////        logger.info("Received new satellite: " + satellite.getSatelliteType() + " " + satellite.getSatelliteClassifier());
////        list.add(satellite.getSatelliteType().keySet().toString() + satellite.getSatelliteClassifier().keySet());
////        return ResponseEntity.ok(satellite);
////    }
//
//    /*Чтение*/
//    @GetMapping("/getSatellite")
//    public List<Satellite> getSatellite() {
////        logger.info(String.valueOf(satelliteRepository.findAll()));
//        return satelliteRepository.findAll();
//    }
//
//    /*Чтение ключей словаря satellite*/
//    @GetMapping("/satelliteGetKey")
//    public List<String> getSatelliteKey() {
//        logger.info(String.valueOf(list));
//        return list;
//    }
//
//    /*Добавление*/
//    @PostMapping("/fields")
//    public ResponseEntity<Fields> addFields(@RequestBody Fields newFields) {
//        logger.info("Received new fields: " + newFields.getValueType() + " "
//                + newFields.getType() + " "
//                + newFields.getDefaultValue() + " "
//                + newFields.getLabel());
//        list1.add(newFields.getValueType().keySet().toString()
//                + newFields.getType().keySet()
//                + newFields.getDefaultValue());
//        Fields fields = fieldsService.addFields(newFields);
//        return ResponseEntity.ok(fields);
//    }
//
//    /*Чтение*/
//    @GetMapping("/fieldsGet")
//    public List<Fields> fieldsGet() {
////        logger.info(String.valueOf(fieldsRepository.findAll()));
//        return fieldsRepository.findAll();
//    }
//
//    /*Чтение ключей словаря fields*/
//    @GetMapping("/fieldsGetKey")
//    public List<String> getFields() {
//        logger.info(list1.toString());
//        return list1;
//    }
//
//    /*Удаление ALL fields*/
//    @DeleteMapping(value = "/fieldsDeleteAll")
//    public ResponseEntity<Fields> deleteFieldsAll() {
//        fieldsRepository.deleteAll();
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    /*Удаление ALL satellite*/
//    @DeleteMapping(value = "/satelliteDeleteAll")
//    public ResponseEntity<Satellite> deleteSatelliteAll() {
//        satelliteRepository.deleteAll();
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    /*Редактирование*/
//    @PutMapping("/satellite/{id}")
//    public Satellite updateSatellite(@RequestBody Satellite  satellite, @PathVariable String id) {
//        satellite.setId(id);
//        satelliteRepository.save(satellite);
//        return  satellite;
//    }
//
//    /*Редактирование*/
//    @PutMapping("/fields/{id}")
//    public Fields updateFields(@RequestBody Fields  fields, @PathVariable String id) {
//        fields.setId(id);
//        fieldsRepository.save(fields);
//        return  fields;
//    }
//
//}
