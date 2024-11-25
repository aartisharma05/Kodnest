package com.kodnest.FirstHibernateProject.FirstHibernateClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;

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
    	Student student = new Student();
    	student.setId(1);
    	student.setAge(25);
    	student.setEmail("aartisharma.official1@gmail.com");
    	student.setMarks(80);
    	student.setName("Aarti");
    	student.setPhone(8875594);
    	
    	session.persist(student);
    	// commit the transaction
    	transaction.commit();
    	
    	// close the session
    	session.close();
    	
    	// close the sessionFactory
    	factory.close();
    }
}
