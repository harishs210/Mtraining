package com.lti.carddock.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/cards")
	public String getCardDetails() {
		return "card details";
	}

}
