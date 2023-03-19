package org.jsp.Spring_Boot_Student_App.controller;


import org.jsp.Spring_Boot_Student_App.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	
	@GetMapping("/student/greeting/msg")
	public String getgreetingMsg() {
		
		return "Good Morning";
	}
	
	@PostMapping("/student/savestudent")
	public void postDemo(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getPercentage());
		System.out.println(student.getPhonenumber());
	}
	
	@GetMapping("/student/getstudent")
	public  Student getStudent()  {
		Student student = new Student();
		student.setId(110);
		student.setName("Rohit");
		student.setAge(23);
		student.setPercentage(89.45);
		student.setPhonenumber(1234545);
		return student;
	}
	
	@PostMapping("/student/display/msg")
	public void postMsg() {
		System.out.println("I am A Student");
	}

}
