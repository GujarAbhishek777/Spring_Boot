package org.jsp.Spring_Boot_Demo_App.controller;

import org.jsp.Spring_Boot_Demo_App.dto.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Controller {
	
	@GetMapping("/hi")
	public String getMsg() {
		
		return "I am getMsg()";
		
	}

	@PostMapping("/hello")
	public void postMsg() {
		System.out.println("I am postMsg()");
	}
	
	@GetMapping("/getdemo")
	public Demo getDemo()  {
		Demo demo = new Demo();
		demo.setId(110);
		demo.setName("DEMO");
		return demo;
	}
	
	@PostMapping("/postdemo")
	public void postDemo(@RequestBody Demo demo) {
		System.out.println(demo.getId());
		System.out.println(demo.getName());
	}
}
