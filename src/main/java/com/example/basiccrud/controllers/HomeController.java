package com.example.basiccrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.basiccrud.model.Student;
import com.example.basiccrud.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	private StudentService stuService;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		System.out.println("Getting all the Students.");
		return stuService.getStudents();
	}
	
	@PostMapping("/addstudents")
	public void addStudent(@RequestBody Student newStudent) {
		stuService.insertStudent(newStudent);
	}
	
	@PutMapping("/changestudents/{id}")
	public Student updateStudent(@RequestBody Student newStudent, @PathVariable int id) {
		return stuService.changeStudent(newStudent, id);
	}
	
	@DeleteMapping("/deleteStudent/{stuId}")
	public void deleteStudent(@PathVariable int stuId) {
		stuService.deleteStudent(stuId); 
	}
}
