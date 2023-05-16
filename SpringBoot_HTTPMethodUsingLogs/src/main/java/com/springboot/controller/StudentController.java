package com.springboot.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService stdservice; 
	
	@PostMapping("/save")
	public void saveStudent(@RequestBody Student student)	{
		stdservice.saveStudent(student);
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStd(){
		
		List<Student> list1=stdservice.getAllStd();
		return list1;
		
		
		
	}
	
}
