package com.nick.apirestcursofullstack.controller;

import com.nick.apirestcursofullstack.entity.User;
import com.nick.apirestcursofullstack.logger.LogPostMethod;
import com.nick.apirestcursofullstack.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    @LogPostMethod
    public ResponseEntity<User> createUser(HttpServletRequest request, @RequestBody User user){
        if(userService.findUserByUsername(user.getEmail()) != null)
            return new ResponseEntity<User>(user, HttpStatus.CONFLICT);

        User createdUser = userService.createUser(user);
        return new ResponseEntity<User>(createdUser, HttpStatus.OK);
    }
}
