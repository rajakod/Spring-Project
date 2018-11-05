package com.Services;

import java.util.List;

import com.pojo.Student;

public interface IStudentSrc {

	Student getStudent(int stId);
	
	List<Student> getAllStudents();
	
	boolean insertStudent(Student st);
	
}