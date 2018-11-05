package com.dao;

import java.util.List;

import com.pojo.Student;

public interface IStudentDao {

	Student getStudent(int stId);

	List<Student> getAllStudents();

	boolean insertStudent(Student st);

}