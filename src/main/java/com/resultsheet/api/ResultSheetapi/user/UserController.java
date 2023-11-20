package com.resultsheet.api.ResultSheetapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin

public class UserController {

    @Autowired
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping(path = "{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(@PathVariable("userId") Long id, @RequestParam(required=false) String firstName, @RequestParam(required=false) String lastName, @RequestParam(required=false) String email){
        userService.updateUser(id, firstName, lastName, email);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") long id){
        userService.deleteUser(id);
    }

}
