package com.example.basiccrud.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.basiccrud.model.Student;
import com.example.basiccrud.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo stuRepo;
	
	
	public List<Student> getStudents(){
		List<Student> studentList = (List<Student>) stuRepo.findAll();
		return studentList;
	}
	
	public void insertStudent( Student stu) {
		System.out.println("Inside PostStudents menthod in Service");
		stuRepo.save(stu);
	}

	public Student changeStudent(Student newStudent, int stuId) {
		List<Student> studentList = (List<Student>) stuRepo.findAll();
		studentList = studentList.stream().map(stu->{
			if(stu.getStudentId() == stuId) {
				stu.setName(newStudent.getName());
				stu.setAddress(newStudent.getAddress());
				stu.setDob(newStudent.getDob());
			}
			return stu;
		}).collect(Collectors.toList());
		stuRepo.save(newStudent);
		return newStudent;
	}
	
	public void deleteStudent(int stuId) {
		stuRepo.deleteById(stuId);
	}
}
