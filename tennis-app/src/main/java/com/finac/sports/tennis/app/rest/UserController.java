package com.finac.sports.tennis.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RequestMapping("/employees")
@RestController
public class UserController {

//    public static HashMap<Integer, Employee> empDB = new HashMap<>();
    @Autowired
    private UserService userService;

    @GetMapping(path = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Employee> list() {

//        System.out.println("Inside list method:");
//        return empDB.values();

        return userService.getAllEmployees();
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employee createEmployee(@RequestBody Employee employee) {

//        empDB.put(e.getID(), e);
//        System.out.println("Employee:" + e);
        return userService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {

        return userService.updateEmployee(id, employee);
    }

    @DeleteMapping(path = "delete/{id}")
    public void deleteEmployee(@PathVariable Integer id) {

//        empDB.remove(id);
//        System.out.println("Delete:" + id);

        userService.deleteEmployee(id);
    }
}
