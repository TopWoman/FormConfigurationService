//package com.example.formconfigurationservice.Controller;
//
//import com.example.formconfigurationservice.Models.Meteor;
//import com.example.formconfigurationservice.Repository.MeteorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class ControllerMeteor {
//
//    @Autowired
//    private MeteorRepository meteorRepository;
//
//    /*Добавление*/
//    @PostMapping("/addMeteor")
//    public ResponseEntity<Meteor> addDevice(@RequestBody Meteor meteor) throws Exception {
//        Meteor meteorNew = meteorRepository.insert(meteor);
//        return new ResponseEntity<>(meteorNew, HttpStatus.CREATED);
//    }
//
//    /*Чтение*/
//    @GetMapping("/allMeteor")
//    public List<Meteor> getAllEmployee() {
//        return meteorRepository.findAll();
//    }
//
////    /*Редактирование*/
////    @PutMapping("/{id}")
////    public Meteor updateEmployee(@RequestBody Meteor  meteor, @PathVariable String id) {
////        meteor.setId(id);
////        meteorRepository.save(meteor);
////        return  meteor;
////    }
//
//    /*Удаление по ID*/
//    @DeleteMapping(value = "/meteorDeleteId/{meteorId}")
//    public String deleteEmployee(@PathVariable String meteorId) {
//        meteorRepository.deleteById(meteorId);
//        return "Deleted Message Successfully: "+ meteorId;
//    }
//
//    /*Удаление ALL*/
//    @DeleteMapping(value = "/meteorDeleteAll")
//    public ResponseEntity<Meteor> deleteEmployeeAll() {
//        meteorRepository.deleteAll();
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    /*Пойск по ID*/
//    @GetMapping("/meteorId/{id}")
//    public Optional<Meteor> getEmployeeId(@PathVariable String id) {
//        return meteorRepository.findById(id);
//    }
//
//}
