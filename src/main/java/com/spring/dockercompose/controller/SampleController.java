package com.spring.dockercompose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dockercompose.entity.Sample;
import com.spring.dockercompose.service.SampleService;

@RestController
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	
	@GetMapping("/")
	public String message() {
		return "Hello Folks";
	}
	
	
	@GetMapping("/data")
	public List<Sample> getData(){
		
		return sampleService.getIt();
		
	}

}
