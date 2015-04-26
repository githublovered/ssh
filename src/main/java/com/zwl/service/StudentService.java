package com.zwl.service;

import java.util.List;

import com.zwl.po.Student;
public interface StudentService {
	public List<Student> find(String name);
}
