package com.controlllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Student;

@Controller
@RequestMapping(value="/student")
public class StudentCtrl {
	
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
 	public @ResponseBody Student getStudent(@RequestParam int stId){
		System.out.println("recieved request student method of student controller java class");
		Student st = new Student();
		st.setId(101);
		st.setName("raja");
		st.setCourse("spring");
		
		return st;
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Student> getAllStudents(){
		
		System.out.println("request to getAll method");
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(101,"raja","spring"));
		listOfStudents.add(new Student(102,"hari","angular"));
		listOfStudents.add(new Student(103,"jay","html"));
		
		return listOfStudents;
		
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public @ResponseBody String insertStudent(@RequestBody Student st){
		
		System.out.println("recieved request to insertStudent method");
		return "Inserted Successfully";
		
	}

}
