package com.example.swaggertest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.swaggertest.pojo.userpojo;


@Repository
public interface userdao extends JpaRepository<userpojo, Long>  {

	
	

}
