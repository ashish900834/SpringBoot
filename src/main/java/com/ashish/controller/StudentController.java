package com.ashish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashish.service.StudentService;
import com.ashish.vo.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	/*@GetMapping(path="/getstd",produces = "application/json")
	public List<Student> getAllStudent(){
		return service.getStudents();
		
	}
	
	@PostMapping(path="/add",produces= "application/json")
	public void addStudents(@RequestBody Student std ) {
		
		Student s=new Student();
		s.setAge(std.getAge());
		s.setName(std.getName());
		s.setAddress(std.getAddress());
		
		service.addStudent(s);
		
	}
	
	@PostMapping(path="/delete",produces = "application/json")
	public void deleteStudent(@RequestBody Student std) {
		service.deleteStd(std);
		
	}*/
	
	
	//--------------------------------------------------------------------------------------------------------
	@GetMapping(value="welcome")
	public String welcome() {
		return "welcome";
	}
	
	
	@GetMapping(value="/welcome/getstd")    
	    public String viewStd(Model m){    
	        List<Student> list=service.getStudents();    
	        m.addAttribute("list",list);  
	        return "getstd"; 
	}
	
	
	
	
	@GetMapping(value="welcome/Login")
	public String login() {
		return "Login";
	}
	
	@GetMapping(value="welcome/delete")
	public String delete() {
		return "delete";
	}
	
	@PostMapping(value="welcome/add")
	public String addStudents(@ModelAttribute Student std ) {
		
		Student s=new Student();
		s.setAge(std.getAge());
		s.setName(std.getName());
		s.setAddress(std.getAddress());
		service.addStudent(s);
		return "success";
		
		
		
//--------------------------------------------------------------------------------------------------------
		
	}
	@PostMapping(value="welcome/del")
	public String deleteStudent(@RequestBody String name) {
		service.deleteStd(name);
		return "redirect:/welcome/getstd";
		
	}

}
