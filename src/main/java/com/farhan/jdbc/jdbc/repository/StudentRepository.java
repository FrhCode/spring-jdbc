package com.farhan.jdbc.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.farhan.jdbc.jdbc.entity.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Student> findAll() {
		return jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<Student>(Student.class));
	}

	public Student findById(String id) {
		return jdbcTemplate.queryForObject("select * from student where id = ?",
				new BeanPropertyRowMapper<Student>(Student.class), id);
	}

	public int deleteById(String id) {
		return jdbcTemplate.update("delete from student where id = ?", id);
	}

}
