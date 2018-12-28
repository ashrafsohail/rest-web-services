package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Controller
@RestController
public class HelloWorldController {

	@GetMapping( path="/helloworld")
	public String helloWorld() {
		return "Hello";
		
	}
	@GetMapping(path="/helloworld-bean-pathvariable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("HelloWorld, %s",name));
	}
}
