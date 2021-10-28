//getting data from DB
package com.learning.springframework.enterprise.flow.data;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public
class DataService {
	public List<Integer> retrieveData() {
		return List.of(66,333,666,154);
	}
	
}