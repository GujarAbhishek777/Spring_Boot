package org.jsp.Spring_Boot_User_App.dao;

import java.util.Optional;

import org.jsp.Spring_Boot_User_App.dto.User;
import org.jsp.Spring_Boot_User_App.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class User_Dao {
    @Autowired
	UserRepository userRepository;
    
    public void saveUser(User user) {
    	userRepository.save(user);
    }
    
//    public User findById(int id) {
//    	return userRepository.findById(id);
//    }
    
    public Optional<User> findById(int id) {
    	return userRepository.findById(id);
    }
    
    public User validateUser(User user) {
    	return userRepository.validateUser(user.getEmail(), user.getPwd());
    }
}
