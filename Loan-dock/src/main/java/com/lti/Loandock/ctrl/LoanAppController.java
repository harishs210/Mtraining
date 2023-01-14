package com.lti.Loandock.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanAppController {
	
	@GetMapping("/loans")
	public String getLoanDetails() {
		return "Loan details..";
	}
	
}
