package com.springboot.service;

import java.util.List;


import com.springboot.entity.Student;


public interface StudentService {
	
	
	public void saveStudent(Student student);
	
	public List<Student> getAllStd();

}
