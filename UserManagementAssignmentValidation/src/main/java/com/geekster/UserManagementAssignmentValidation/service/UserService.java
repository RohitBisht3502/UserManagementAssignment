package com.geekster.UserManagementAssignmentValidation.service;

import com.geekster.UserManagementAssignmentValidation.model.User;
import com.geekster.UserManagementAssignmentValidation.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;


    public String addUsers(List<User> newUser) {

        userRepo.saveAll(newUser);
        return "Added Sucessfully";
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    public User getUserById(Integer id) {
       return  userRepo.findById(id).get();
    }

    public String deleteUserById(Integer id) {
        userRepo.deleteById(id);
        return "Delete Successfully";
    }

    public String updateUserById(Integer id, String number) {
        User presentUser=userRepo.findById(id).orElse(null);
        if(presentUser!=null){
            presentUser.setUserNumber(number);
            return "Updated Sucessfully";
        }
        return "User not found";
    }
}
