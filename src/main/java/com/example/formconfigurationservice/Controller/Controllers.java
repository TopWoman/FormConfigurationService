package com.example.formconfigurationservice.Controller;

import com.example.formconfigurationservice.Models.Employee;
import com.example.formconfigurationservice.Models.Fields;
import com.example.formconfigurationservice.Models.Satellite;
import com.example.formconfigurationservice.Repository.EmployeeRepository;
import com.example.formconfigurationservice.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Controllers {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;
//    private final SatelliteRep satelliteRep;
    public Controllers(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*Добавление*/
    @PostMapping("/add")
    public ResponseEntity<Employee> addDevice(@RequestBody Employee newEmployee) throws Exception {
        Employee employee = employeeService.addEmployee(newEmployee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

//    @PostMapping("/aKey")
//    public ResponseEntity<Satellite> aKey(@RequestBody String addKey) throws Exception {
//        Satellite satellite = (Satellite) employeeService.add(addKey);
////        List allKey = new ArrayList();
////        allKey.add(addKey.getKey());
//        return new ResponseEntity<>(satellite, HttpStatus.CREATED);
//    }

//    Logger logger = LoggerFactory.getLogger(FormconfigurationserviceApplication.class);
//    @GetMapping("/adKey")
//    public List<String> getSatellite(Satellite satellite) {
//        List<String> list = new ArrayList<>();
//        for(String key : satellite.getSatelliteType().keySet()){
//            list.add(key);
//            System.out.println(key);
//        }
//        return list;
//    }

//    @GetMapping("/addKey")
//    public List<Satellite> addKey(@RequestBody Satellite addKey) throws Exception {
//        List allKey = new ArrayList();
//        allKey.add(addKey.getKey());
//        return allKey;
//    }

    /*Чтение*/
    @GetMapping("/all")
    public List<Employee> getAllEmployee() {
        return employeeService.detAllEmployee();
    }

    /*Редактирование*/
    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee  employee, @PathVariable String id) {
        employee.setId(id);
        employeeRepository.save(employee);
        return  employee;
    }

    /*Удаление по ID*/
    @DeleteMapping(value = "/employeeDeleteId/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        employeeRepository.deleteById(employeeId);
        return "Deleted Message Successfully: "+ employeeId;
    }

    /*Удаление ALL*/
    @DeleteMapping(value = "/employeeDeleteAll")
    public ResponseEntity<Employee> deleteEmployeeAll() {
        employeeRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /*Пойск (пойск омг) по ID*/
    @GetMapping("/schemas/{id}")
    public Optional<Employee> getEmployeeId(@PathVariable String id) {
        return employeeRepository.findById(id);
    }

    /*Пойск по formName*/
    @GetMapping("/getFormName/{formName}")
    public List<Employee> getFormName(@PathVariable String formName) {
            return employeeService.formNameSearch(formName);
    }

    //записать куки
    @GetMapping(value = "/set-cookie")
    public ResponseEntity<?> setCookie(HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie("data", "Come_to_the_dark_side");//создаем объект Cookie,
        //в конструкторе указываем значения для name и value
        cookie.setPath("/");//устанавливаем путь
        cookie.setMaxAge(86400);//здесь устанавливается время жизни куки
        response.addCookie(cookie);//добавляем Cookie в запрос
        response.setContentType("text/plain");//устанавливаем контекст
        return ResponseEntity.ok().body(HttpStatus.OK);//получилось как бы два раза статус ответа установили, выбирайте какой вариант лучше
    }

    //прочитать заголовки
    @GetMapping(value = "/get-headers")
    public ResponseEntity<?> getHeaders(@RequestHeader Map<String, String> headers){//представляет заголовки ввиде мапы,
        //где ключ это наименование заголовка, а значение мапы - это значение заголовка
        return ResponseEntity.ok(headers);
    }
}
