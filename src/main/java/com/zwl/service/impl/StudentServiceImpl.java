package com.zwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwl.dao.StudentDAO;
import com.zwl.po.Student;
import com.zwl.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO stuDao;
	@Override
	public List<Student> find(String name) {
		return stuDao.findAll();
	}
	
}
