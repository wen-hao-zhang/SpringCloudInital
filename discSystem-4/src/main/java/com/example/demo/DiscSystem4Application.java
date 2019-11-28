package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //配置客户端
@RestController //配置为controller
public class DiscSystem4Application {
	
	public static void main(String[] args) {
		SpringApplication.run(DiscSystem4Application.class, args);
	}

	@Value("${server.port}") //读取配置文件的端口
	String port;
	
	@RequestMapping(value = "/test")
	public String testMethod() {
		return "Hello World!!! 端口为：" + port;
	}
}
