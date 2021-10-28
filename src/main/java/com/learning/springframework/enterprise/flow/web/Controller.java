package com.learning.springframework.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springframework.enterprise.flow.business.BusinessService;

//send response to user in correct format
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	// "/add => output as 1000
	@GetMapping("/add")
	public long displayAdd() {
		return businessService.performAdd();
	}
}




