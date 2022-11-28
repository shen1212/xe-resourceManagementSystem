package com.rms.ResourceManagementAPI.controller;


import com.rms.ResourceManagementAPI.model.User;
import com.rms.ResourceManagementAPI.response.ResponseHandler;
import com.rms.ResourceManagementAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New user added";
    }


    @GetMapping("/getAll")
    public ResponseEntity<Object> getAllUsers(){
        return ResponseHandler.reponseBuilder("Requested All Users",
                HttpStatus.OK,
                userService.getAllUsers());
    }


    @GetMapping("/{userUUID}")
    public ResponseEntity<Object> getSpecificUser(@PathVariable("userUUID") UUID userUUID) {
        return ResponseHandler.reponseBuilder("Requested Specific User",
                HttpStatus.OK,
                userService.getSpecificUser(userUUID));
    }

}
