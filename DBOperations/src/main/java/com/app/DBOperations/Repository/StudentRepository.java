package com.app.DBOperations.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.DBOperations.Dto.CourseDto;
import com.app.DBOperations.Entity.Course;
import com.app.DBOperations.Entity.Student;
import com.app.DBOperations.Util.SessionFactoryUtill;

public class StudentRepository
{
	public void saveStudent(Course c)
	{
		SessionFactory factory = SessionFactoryUtill.getSessionFactory();
		Session session = factory.openSession();
		Transaction transcation = session.beginTransaction();
		//for(Student s:st)
		{
			session.merge(c);
		}
		transcation.commit();
	}
	public static  Course getById(int id)
	{
		SessionFactory factory = SessionFactoryUtill.getSessionFactory();
		Session session = factory.openSession();
		Transaction transacation = session.beginTransaction();
		Course course = session.get(Course.class, id);
		transacation.commit();
		return course;
	}
	public  void updateData(CourseDto course)
	{
		Course c = getById(course.getId());
		if(c!=null)
		{
			c.setCredites(course.getCredites());
			saveStudent(c);
		}
	}
	public void deleteCourseById()
	{
		SessionFactory factory = SessionFactoryUtill.getSessionFactory();
		Session session = factory.openSession();
		Transaction transcation = session.beginTransaction();
		Course course = session.get(Course.class, 10);
		int id = course.getId();
		if(id==10)
		{
			session.delete(id);
		}
		transcation.commit();
		
		session.close();
	}
}
