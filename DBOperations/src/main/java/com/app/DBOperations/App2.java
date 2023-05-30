package com.app.DBOperations;

import java.util.ArrayList;
import java.util.List;

import com.app.DBOperations.Dto.CourseDto;
import com.app.DBOperations.Entity.Course;
import com.app.DBOperations.Entity.Student;
import com.app.DBOperations.Repository.StudentRepository;

public class App2 
{
	public static void main(String[] args)
	{
		Course c = new Course();
		c.setName("java");
		c.setCredites("80");
		
		Course c1 = new Course();
		c1.setName("J2EE");
		c1.setCredites("70");
		
		Course c2 = new Course();
		c2.setName("HiberNate");
		c2.setCredites("75");
		
		
		ArrayList<Course> list = new ArrayList<>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		
		Student s = new Student();
		s.setName("Hadsun");
		s.setEmailId("had@12455.com");
		s.setCourse(list);
		
		Student s1 = new Student();
		s1.setName("clery");
		s1.setEmailId("clery@12755.com");
		s1.setCourse(list);
		
		Student s2 = new Student();
		s2.setName("Cooper");
		s2.setEmailId("cop@1223455.com");
		s2.setCourse(list);
		
		
		
		List<Student> slist = new ArrayList<>();
		
		slist.add(s);
		slist.add(s1);
		slist.add(s2);
		
		c.setList(slist);
		c1.setList(slist);
		c2.setList(slist);
		//c2.setStudent(slist);
		
		// ***********SAVE DATA************//
		StudentRepository sr = new StudentRepository();
		//sr.saveStudent(c1);
		
		//**********Update DATA*************
		CourseDto dto = new CourseDto();
		dto.setId(2);
		dto.setCredites("90");
		//sr.updateData(dto);
		
		//******************Getting DAta************
		Course byId = sr.getById(2);
		//System.out.println(byId);
		
		
		//****************Delete Data****************
		sr.deleteCourseById();
		
	}
}
