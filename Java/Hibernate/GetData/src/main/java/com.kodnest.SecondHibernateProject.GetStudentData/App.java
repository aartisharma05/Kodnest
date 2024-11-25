package com.kodnest.SecondHibernateProject.GetStudentData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	//Loading the configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	
    	// Creating the sessionFactory
    	SessionFactory factory = configuration.buildSessionFactory();
        
    	// Open the session
    	Session session = factory.openSession();
    	
    	
    	// begin the transaction
    	Transaction transaction = session.beginTransaction();
    	
    	// Perform Operations
    	Student obj = session.get(Student.class, 168);
    	if(obj!=null) {
    		System.out.println("ID = " + obj.getId());
    		System.out.println("NAME = " + obj.getName());
    		System.out.println("AGE = " + obj.getAge());
    		System.out.println("MARKS = " + obj.getMarks());
    		System.out.println("EMAIL = " + obj.getEmail());
    		System.out.println("PHONE = " + obj.getPhone());
    	} else {
    		System.out.println("STUDENT WITH THE ID 168 IS NOT PRESENT");
    	}
    	
    	
    	// commit the transaction
    	transaction.commit();
    	
    	// close the session
    	session.close();
    	
    	// close the sessionFactory
    	factory.close();
    }
}
