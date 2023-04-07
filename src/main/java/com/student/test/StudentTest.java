package com.student.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student.pojo.Student;

public class StudentTest {
       
	public static void main(String[] args) {
		
    	 Session session = HibernateUtil.getSession();
    	  Transaction transaction = session.beginTransaction();
    	  Student student = new Student(2,"Advait","Deshpande");
    	  session.save(student);
    	  transaction.commit(); 
	}
}
