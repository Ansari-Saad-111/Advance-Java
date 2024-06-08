package com.bean;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		//1insert code


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id name and sal"); 
		int id=sc.nextInt(); //1
		String name=sc.next(); //aaa
		float sal=sc.nextFloat();//55000

		Employee e=new Employee(id,name,sal); 
		int status=dao.saveEmployee(e);

		System.out.println(status);



		//2update code
		//int status=dao.updateEmployee(new Employee(2,"Rupesh",70000)); 
		//System.out.println(status); 



		//3delete code
		/*Employee e=new Employee(); 
		System.out.println("Enter id for delete"); 
		int id=sc.nextInt();
		e.setId(id); //1
		int status=dao.deleteEmployee(e);
		System.out.println(status);*/

		//4select records
		//dao.selectEmployee();

	}

}
