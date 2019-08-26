package com.ashish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.dao.StudentDao;
import com.ashish.vo.Student;
@Service
public class StudentService {
	@Autowired
	private StudentDao stdao;
	
	public List<Student> getStudents() {
		
		
		return (List<Student>) stdao.findAll(); 
		
	}
	
	public String addStudent(Student st) {
		
		Student std=new Student();
		std.setAge(st.getAge());
		std.setName(st.getName());
		std.setAddress(st.getAddress());
		
		stdao.save(std);
		return "success";
		
	}
	
	public void deleteStd(String name) {
		stdao.deleteByName(name);
	}

}
