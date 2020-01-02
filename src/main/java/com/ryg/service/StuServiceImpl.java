package com.ryg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ryg.entity.Student;
import com.ryg.mapper.StuMapper;

@Service
public class StuServiceImpl implements StuService{

	@Autowired
	private StuMapper mapper;
	
	
	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}

}
