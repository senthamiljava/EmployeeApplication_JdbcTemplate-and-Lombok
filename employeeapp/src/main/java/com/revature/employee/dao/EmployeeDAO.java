package com.revature.employee.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.employee.connection.ConnectionUtil;
import com.revature.employee.model.Employee;

public class EmployeeDAO {
JdbcTemplate jd=ConnectionUtil.getjdbcTemplate();
public void addEmployee(Employee emp)
{
	String sql="insert into employee(id,name,salary) values(?,?,?)";
	Object params[]={emp.getId(),emp.getName(),emp.getSalary()};
	int rows=jd.update(sql,params);
	System.out.println("number of row inserted "+rows);
	
}
}
