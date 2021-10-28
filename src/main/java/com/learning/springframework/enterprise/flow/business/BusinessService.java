//responsible for business logic
package com.learning.springframework.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.springframework.enterprise.flow.data.DataService;

@Component
public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long performAdd() {
		 List<Integer> data = dataService.retrieveData(); 
		 return data.stream().reduce(Integer::sum).get();
	}
	
}