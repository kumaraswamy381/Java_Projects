package com.GetRecordApp.java;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.market.model.Student;

public class GetRecordApp {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		 Session session;
		try
		{
			
			session=sessionFactory.openSession();
			Student student = session.get(Student.class, 3);
		    System.out.println(student);
		}
		
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
		
			
		}
	}

}
