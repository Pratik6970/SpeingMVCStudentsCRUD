package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StudentDao {
	
	@Autowired
   private HibernateTemplate hibernateTemplate;
	
	
	
	//create
	@Transactional
	public void create_Student(Student student)
	{
		System.out.println("create_student called here"+getClass().getName());
		this.hibernateTemplate.saveOrUpdate(student);
	}
	
	//getall student
	@Transactional
	public List<Student>getallStudent()
	{
		
		List<Student>student=hibernateTemplate.loadAll(Student.class);
		return student;
		
	}
	
	@Transactional
	public void deletestudent(int sid)
	{
		Student student=hibernateTemplate.load(Student.class, sid);
		hibernateTemplate.delete(student);
		
	}
	
	//getsinglestudent
	@Transactional
	public Student getSinglestudent(int sid)
	{
		return hibernateTemplate.get(Student.class,sid);
	}
	

}
