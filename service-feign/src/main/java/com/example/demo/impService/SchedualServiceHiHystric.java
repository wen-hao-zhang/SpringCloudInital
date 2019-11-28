package com.example.demo.impService;

import org.springframework.stereotype.Component;

import com.example.demo.service.SchedualClientName;

@Component
public class SchedualServiceHiHystric implements SchedualClientName {

	@Override
	public String sayHiFromClientOne() {
		
		return "sorry";
	}

}
