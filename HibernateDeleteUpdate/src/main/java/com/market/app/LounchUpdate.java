package com.market.app;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.market.model.Student;


public class LounchUpdate 
{

	public static void main(String[] args) 
	{
	        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	        Session session =null;
	        Transaction transaction = null;
	        boolean flag=false;
             try
             {
            	  session = sessionFactory.openSession();
            	  transaction= session.beginTransaction();
            	
            	  Student student = new Student();
            	  student.setsID(3);
            	  student.setsName("swamy");
            	  student.setsCity("Karagapadu");
            	  //session.saveOrUpdate(student);
            	  session.merge(student);
            	  flag=true;
            	 
             }
             catch(HibernateException e)
             {
            	 e.printStackTrace();
             }
             catch(Exception e)
             {
            	 e.printStackTrace();
             }
             finally {
            	 if (flag==true) 
            		 transaction.commit();
            	 else
            		 transaction.rollback();
            	 
            	 session.close();
            	 sessionFactory.close();
            	 
            	 }
             }
	}


