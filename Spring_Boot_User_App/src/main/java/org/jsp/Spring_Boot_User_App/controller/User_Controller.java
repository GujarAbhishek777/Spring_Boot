package org.jsp.Spring_Boot_User_App.controller;

import java.util.Optional;

import org.jsp.Spring_Boot_User_App.dao.User_Dao;
import org.jsp.Spring_Boot_User_App.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_Controller {
    @Autowired
	private User_Dao dao;
    @PostMapping("/user/saveuser")
    public void saveUser(@RequestBody  User user) {
    	dao.saveUser(user);
    }
    
//    @GetMapping("/user/finduser/id")
//    public User findById( @RequestParam int  id) {
//    	return dao.findById(id);
//    }
    
    @GetMapping("/user/finduser/id")
    public Optional<User> findById( @RequestParam int  id) {
    	return dao.findById(id);
    }
    
    @GetMapping("/user/loging")
    public User validateUser(@RequestBody User user) {
    	return dao.validateUser(user);
    }
}
