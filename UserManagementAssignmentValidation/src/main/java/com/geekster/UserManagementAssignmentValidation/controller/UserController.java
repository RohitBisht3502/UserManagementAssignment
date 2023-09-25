package com.geekster.UserManagementAssignmentValidation.controller;

import com.geekster.UserManagementAssignmentValidation.model.User;
import com.geekster.UserManagementAssignmentValidation.service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("users")
    public String addUsers(@RequestBody List<User> newUser){

        return userService.addUsers(newUser);
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
       return userService.getAllUsers();

    }
    @PutMapping ("users/updateNumber")
    public String updateUserById(@RequestParam Integer id,@RequestParam String number){
        return userService.updateUserById(id,number);
    }

    @GetMapping("api/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
    @DeleteMapping("api/deleting/user/{userId}")
    public String deleteUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }
}
