package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


import com.app.dao.Student;
import com.app.dao.StudentDao;

@Controller
public class MainController {
	
	@Autowired
	private StudentDao studentdao;
	
	public MainController() {
		System.out.println("MainController() called here"+getClass().getName());
	}
	
	@RequestMapping("/")
	public String Home(Model map)
	{
		System.out.println("Home called here");

		List<Student>students=studentdao.getallStudent();
	   map.addAttribute("students", students);
		return "index";
		
	}
	
	@RequestMapping("/addss")
	public String addStudent(Model map)
	{
		System.out.println("addStudent() call here"+getClass().getName());
		map.addAttribute("title", "student");
		return "add_form";
	}
	
	
	@RequestMapping(value = "/handle-student",method = RequestMethod.POST)
	public RedirectView getHandler(@ModelAttribute Student student,HttpServletRequest request)
	{
		System.out.println(student);
		RedirectView redirectView = new RedirectView();
		
		studentdao.create_Student(student);
		redirectView.setUrl(request.getContextPath()+"/");
		
		
		return redirectView;
	}
	
	@RequestMapping("/deletes/{studentid}")
	public RedirectView deleteHandler(@PathVariable("studentid")int studentid, HttpServletRequest request)
	{
		this.studentdao.deletestudent(studentid);
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
		
		
	}
	
	@RequestMapping("/update/{studentId}")
	public String updateForm(@PathVariable("studentId") int studentId,Model map)
	{
		
		Student st=studentdao.getSinglestudent(studentId);
		map.addAttribute("st", st);
		return "update_form";
		
	}
	

}
