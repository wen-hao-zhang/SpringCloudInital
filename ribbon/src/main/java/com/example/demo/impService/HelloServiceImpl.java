package com.example.demo.impService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.RemoteCallService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloServiceImpl implements RemoteCallService{

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "hiError") //hiError是服务断后走的方法名字
	public String hiService(String name) {
		
		return restTemplate.getForObject("http://CLIENTNAME/test", String.class);
	}

	public String hiError(String name) {
		return "页面访问不到，走到失败结果页面！";
	}
}
