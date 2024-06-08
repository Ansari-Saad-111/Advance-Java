package com.hibernate;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class StoreData
{
public static void main(String[] args)
{
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction t=session.beginTransaction();
	
	Answer ans1=new Answer();
	ans1.setAnswername("java is a programming language");
	
	Answer ans2=new Answer();
	ans2.setAnswername("java is a platform");
	
	Answer ans3=new Answer();
	ans3.setAnswername("Servlet is an Interface");
	
	Answer ans4=new Answer();
	ans4.setAnswername("Servlet is an API");
	
	ArrayList<Answer> list1=new ArrayList<Answer>();
	list1.add(ans1);
	list1.add(ans2);
	
	ArrayList<Answer> list2=new ArrayList<Answer>();
	list2.add(ans3);
	list2.add(ans4);
	
	
	Question question1=new Question();
	question1.setQname("What is Java?");
	question1.setAnswers(list1);
	
	Question question2=new Question();
	question2.setQname("What is Servlet?");
	question2.setAnswers(list2);
	
	session.persist(question1);
	session.persist(question2);
	
	t.commit();
	session.close();
	System.out.println("success");
	
	// deleting an object...
	
	
	 /* Question question=(Question)session.get(Question.class,1);
	  session.delete(question); 
	  session.getTransaction().commit();
	  
	  System.out.println("<<Delete>>: question1 is deleted..."); 
	  t.commit();*/
	 
	//	session.close();
	
}
}
