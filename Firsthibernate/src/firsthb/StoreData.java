package firsthb;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		//creating configuration object  
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file 
		
		SessionFactory factory=cfg.buildSessionFactory();  
		Session session=factory.openSession();  
		session.beginTransaction();
		
		Employee e1=new Employee();  
		e1.setId(1);
		e1.setFirstName("abc");  
		e1.setLastName("abc"); 
		
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
