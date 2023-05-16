package com.springboot.serviceimpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.StudentRepository;
import com.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public void saveStudent(Student student) {
		 studentrepository.save(student);
	
		
	}

	@Override
	public List<Student> getAllStd() {
		List<Student> llist=(List<Student>) studentrepository.findAll();
		return llist;
	}
	
	

}
