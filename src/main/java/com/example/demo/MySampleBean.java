package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
@Service
public class MySampleBean {
	@Bean
	public String getDataFromBean() {
		return "This is from Bean";
	}
}