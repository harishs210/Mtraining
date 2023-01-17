package com.classroom.classroom.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/class")
public class ClassController {
	
	@GetMapping("/info")
	public String getClassDetails() {
		
		return "class information will get.";
		
	}
}
