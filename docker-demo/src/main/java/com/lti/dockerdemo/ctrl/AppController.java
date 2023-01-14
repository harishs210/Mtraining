package com.lti.dockerdemo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/app")
	public String getAppdetails() {
		return "Doocker app";
		
	}

}
