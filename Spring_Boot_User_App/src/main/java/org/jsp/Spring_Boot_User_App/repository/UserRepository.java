package org.jsp.Spring_Boot_User_App.repository;

import org.jsp.Spring_Boot_User_App.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

	//User findById(int id);
	//we are writing my email for the alias name in the sql query
	@Query("select u from User u where u.email=:myemail And u.pwd=:mypwd")
	User validateUser(@Param("myemail") String email,@Param("mypwd") String pwd);
}
