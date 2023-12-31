package com.guides.springboot.controller.api;

import com.guides.springboot.entity.Users;
import com.guides.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Component
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // build create User REST API
    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
        Users savedUsers = userService.createUser(users);
        return new ResponseEntity<>(savedUsers, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<Users> getUserId(@PathVariable("id") long userId) {
        Users users = userService.getUserById(userId);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build Update User REST API
    // http://localhost:8080/api/users/1
    @PutMapping("{id}")
    public ResponseEntity<Users> updateUser(@PathVariable("id") Long userId,
                                            @RequestBody Users user) {
        user.setId(userId);
        Users updateUsers = userService.updateUsers(user);
        return new ResponseEntity<>(updateUsers, HttpStatus.OK);

    }
    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }


}
