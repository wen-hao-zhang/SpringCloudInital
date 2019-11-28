package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SchedualClientName;

@RestController
public class ClientNameController {
			@Autowired
			SchedualClientName schedualClientName;
			
			@RequestMapping(value = "/demo",method = RequestMethod.GET)
			public String sayHi() {
				return schedualClientName.sayHiFromClientOne();
			}

			}
