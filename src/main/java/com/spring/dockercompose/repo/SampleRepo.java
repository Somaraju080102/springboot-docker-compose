package com.spring.dockercompose.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.dockercompose.entity.Sample;

@Repository
public interface SampleRepo extends JpaRepository<Sample, String> {

}
