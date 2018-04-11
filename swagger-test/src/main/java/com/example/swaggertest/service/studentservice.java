package com.example.swaggertest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swaggertest.dao.studentdao;
import com.example.swaggertest.pojo.StudentPojo;

@Service
public class studentservice {
	@Autowired
	private studentdao dao;
	
public String insert(StudentPojo sp){
		
		return "success";
	}

}
