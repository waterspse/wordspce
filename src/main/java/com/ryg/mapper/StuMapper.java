package com.ryg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ryg.entity.Student;

public interface StuMapper {

	@Select("select * from a_student")
	List<Student> list();

}
