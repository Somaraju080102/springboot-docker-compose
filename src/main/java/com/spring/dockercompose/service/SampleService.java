package com.spring.dockercompose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dockercompose.entity.Sample;
import com.spring.dockercompose.repo.SampleRepo;

@Service
public class SampleService {
	
	@Autowired
	SampleRepo sampleRepo;

	public List<Sample> getIt() {
		// TODO Auto-generated method stub
		return sampleRepo.findAll();
	}

}
