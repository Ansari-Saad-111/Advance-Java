package com.hibernate;

import java.util.Iterator;
import org.hibernate.cfg.*;
import org.hibernate.*;
import java.util.List;

public class Store {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		System.out.println("Connected to MySQL database via Hibernate..." + session);
		session.beginTransaction();
		
		  Address address1=new Address();
		  address1.setAddressLine1("Gangapur road");
		  address1.setCity("Nashik"); 
		  address1.setState("MH");
		  address1.setCountry("India");
		  
		  Employee e1=new Employee();
		  e1.setName("Admin");
		  e1.setEmail("admin@gmail.com"); 
		  e1.setAddress(address1);
		  
		  session.persist(e1);//insert
		  
		  session.getTransaction().commit();//save
		 

		// ---------------------------

		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);

			Address address = emp.getAddress();
			System.out.println(address);
		}

		// deleting an object...

		
		  Employee employee1=(Employee)session.get(Employee.class,2);//select
		  session.delete(employee1); 
		  session.getTransaction().commit();//save
		  System.out.println("Object deleted");
		 

		// updating an object...

		
		 /* Employee employee2 = (Employee) session.get(Employee.class, 1);
		  employee2.setName("archana");
		  employee2.setEmail("archana@gmail.com");
		  session.update(employee2);
		  session.getTransaction().commit();
		  System.out.println("<<Update>>: is updated..." + employee2);
		 
		session.close();
		System.out.println("success");*/
	}
}