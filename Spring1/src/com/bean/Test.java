package com.bean;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class Test
{
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("s1");//DI  
	    student.displayInfo();
	    
	    student=(Student)factory.getBean("s2");  
	    student.displayInfo();
	    
	    Employee s=(Employee)factory.getBean("e1");  
        s.display();
	}  

}
