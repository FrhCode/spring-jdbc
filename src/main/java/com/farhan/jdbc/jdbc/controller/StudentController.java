package com.farhan.jdbc.jdbc.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farhan.jdbc.jdbc.dao.StudentDao;
import com.farhan.jdbc.jdbc.entity.Student;
import com.farhan.jdbc.jdbc.repository.StudentRepository;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository studentRepository;

	@GetMapping
	public List<Student> index() {
		// studentRepository.deleteById("1");
		List<Student> students = studentRepository.findAll();
		Student student = studentRepository.findById("1");
		logger.info("List of user => {}", students);
		logger.info("Data User By id number 1 is => {}", student);
		return students;
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable String id) {
		Student student = studentRepository.findById(id);
		return student;
	}

	@DeleteMapping("/{id}")
	public int deleteStudentById(@PathVariable String id) {
		int count = studentRepository.deleteById(id);
		return count;
	}

	@PostMapping
	public Student createStudent(@RequestBody StudentDao student) {
		logger.info("new student {}", new StudentDao(student.getName(), student.getLocation(), student.getBirth_date()));
		return new Student("1", student.getName(), student.getLocation(), student.getBirth_date());
	}
}
