package com.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IStudentDao;
import com.pojo.Student;

@Service
public class StudentServiceImpl implements IStudentSrc {
	
	@Autowired
	private IStudentDao studentDao;
	
	public IStudentDao getStudentDao() {
		return studentDao;
	}
	
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public Student getStudent(int stId) {

		Student stObj = studentDao.getStudent(stId);
		
		return stObj;
	}

	public List<Student> getAllStudents() {

		List<Student> listOfStudents = studentDao.getAllStudents();
		
		return listOfStudents;
	}

	public boolean insertStudent(Student st) {
		// TODO Auto-generated method stub
		return false;
	}

}