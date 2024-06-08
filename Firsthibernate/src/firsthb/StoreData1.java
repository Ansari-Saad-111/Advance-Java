package firsthb;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

public class StoreData1 {  
	public static void main(String[] args) {  

		//creating configuration object  
		Configuration cfg=new Configuration();  
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

		SessionFactory factory=cfg.buildSessionFactory();  
		Session session=factory.openSession();  
		session.beginTransaction();

		Scanner sc=new Scanner(System.in);
		int id;  
		String firstName,lastName;
		System.out.println("Enter id,fname,lname");
		id=sc.nextInt();
		firstName=sc.next();
		lastName=sc.next();
		Employee e1=new Employee();  
		e1.setId(id);
		e1.setFirstName(firstName);  
		e1.setLastName(lastName); 


		session.persist(e1);//persisting the object -insert

		session.getTransaction().commit();//save
		System.out.println("object inserted");
		//------------------------------------------------------

		Query query=session.createQuery("from Employeee");  
		List<Employee> list=query.list();  

		for (Employee emp : list)
		{
			System.out.println(emp);  
		}

		session.close();  

		System.out.println("successfully saved");  

	}  
}  