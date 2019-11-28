package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RemoteCallService;

@RestController
public class HelloController {
    
	@Autowired
	RemoteCallService helloService;
	
	@RequestMapping(value = "/demo",method = RequestMethod.GET)  //访问入口
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
	
}
