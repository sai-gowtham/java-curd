package com.example.swaggertest.controller;

import com.example.swaggertest.pojo.StudentPojo;
import com.example.swaggertest.pojo.userpojo;
import com.example.swaggertest.service.Studentdaoimpl;
import com.example.swaggertest.service.userdao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

	@Autowired
	private Studentdaoimpl service;
	
	@Autowired
	private userdao userservice;

	@RequestMapping(value="/health",method = RequestMethod.GET)
	public String healthCheck(){

		return "working";
	}
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	@Transactional
	public String insert(@RequestBody StudentPojo sp){

		service.save(sp);
		return "success";
	}

	@RequestMapping(value="/getall",method = RequestMethod.GET)
	public List<StudentPojo> getall(){

		return service.findAll();

	}
	@RequestMapping(value="/findone/{id}",method = RequestMethod.GET)
	public Optional<StudentPojo> getall(@PathVariable long id){

		return service.findById(id);

	}
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
	public String delete(@PathVariable long id){
		 service.deleteById(id);
		 return "deleted";
	}
//	@RequestMapping(value="/update/{id}/{age}",method = RequestMethod.GET)
//	public String update(@PathVariable long id,int age){
//		service.update( age,id);
//		 return "deleted";
//	}
	@RequestMapping(value="/register",method = RequestMethod.POST)
	@Transactional
	public String register(@RequestBody userpojo u){
		userservice.save(u);
		return "success";
	}
}
