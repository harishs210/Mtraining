package com.lti.addresssvc.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	@GetMapping("/address")
	public String getAddressDetails() {
		return "address details";
	}

}
