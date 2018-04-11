package com.example.swaggertest.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.swaggertest.pojo.StudentPojo;
@Repository
public interface Studentdaoimpl extends JpaRepository<StudentPojo, Long>  {

	
	

}
