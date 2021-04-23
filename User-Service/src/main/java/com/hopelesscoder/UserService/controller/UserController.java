package com.hopelesscoder.UserService.controller;

import antlr.debug.DebuggingParser;
import com.hopelesscoder.UserService.VO.Department;
import com.hopelesscoder.UserService.VO.ResponseTemplateVO;
import com.hopelesscoder.UserService.entity.User;
import com.hopelesscoder.UserService.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserByID(@PathVariable("id") Long userId){
        return userService.getUserWithDepartment(userId);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
