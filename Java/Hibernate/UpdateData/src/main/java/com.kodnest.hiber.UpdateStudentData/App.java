package com.kodnest.hiber.UpdateStudentData;

import java.util.Scanner;

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
    	
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter the id of student you want to delete from the database");
    	int id = scn.nextInt();
    	Student obj = session.get(Student.class, id);
    	if(obj!=null) {
    		obj.setName("Ananya");
    		obj.setMarks(93);
    		session.update(obj);
    		System.out.println("Student with id " +  id + " updated successfully in the database") ;
    	} else {
    		System.out.println("NOTHING TO DELETE STUDENT ENTRY NOT PRESENT");
    	}
    	
    	
    	// commit the transaction
    	transaction.commit();
    	
    	// close the session
    	session.close();
    	
    	// close the sessionFactory
    	factory.close();
    }
}
