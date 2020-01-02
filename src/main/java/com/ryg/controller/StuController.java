package com.ryg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ryg.entity.Student;
import com.ryg.service.StuService;

@Controller
public class StuController {
	
	@Autowired
	private StuService stuService;
	
	@RequestMapping("/list")
	public String list(HttpSession  session,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 2);
		
		List<Student> list = stuService.list();
		
		PageInfo<Student> pageInfo = new PageInfo<>(list);
		session.setAttribute("list", list);
		session.setAttribute("pg", pageInfo);
		return "list";
	}
}
