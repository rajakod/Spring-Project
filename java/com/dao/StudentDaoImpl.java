package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplateObj;
	
	public JdbcTemplate getJdbcTemplateObj() {
		return jdbcTemplateObj;
	}
	public void setJdbcTemplateObj(JdbcTemplate jdbcTemplateObj) {
		this.jdbcTemplateObj = jdbcTemplateObj;
	}

	public Student getStudent(int stId) {

		String query = "select * from student where id = ?";
		
		Student stObj = jdbcTemplateObj.queryForObject(query, new Object[]{stId}, new BeanPropertyRowMapper<Student>(Student.class));
		
		return stObj;
	}

	public List<Student> getAllStudents() {

		String query = "select * from student";
		List<Student> listOFStudents = jdbcTemplateObj.query(query, new BeanPropertyRowMapper<Student>(Student.class));
		
		return listOFStudents;
	}

	public boolean insertStudent(Student st) {
		// TODO Auto-generated method stub
		return false;
	}

}