package com.example.basiccrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.basiccrud.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

}
