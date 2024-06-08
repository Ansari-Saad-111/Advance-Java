package com.bean;
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.support.rowset.SqlRowSet;
public class EmployeeDao
{  
	private JdbcTemplate jdbcTemplate;  

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{  
		this.jdbcTemplate = jdbcTemplate;  
	} 

	public int saveEmployee(Employee e)//1,aaa,55000
	{  
	
		//String query="insert into emp values(11,'abc',55000)"; 
		  
		return jdbcTemplate.update("insert into emp values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')");  
	}  
	public int updateEmployee(Employee e)//2,rupesh,70000
	{  
		String query="update emp set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
		return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e)//1
	{  
		String query="delete from emp where id='"+e.getId()+"' ";//1  
		return jdbcTemplate.update(query);  
	} 
	public void selectEmployee()
	{  
		
		SqlRowSet rs=jdbcTemplate.queryForRowSet("select * from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		}
		
		  
	} 

}  