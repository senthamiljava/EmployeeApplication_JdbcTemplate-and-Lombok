package com.revature.employee.dao;

import com.revature.employee.model.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(4);
		employee.setName("surya");
		employee.setSalary(30000);
		EmployeeDAO employeedao=new EmployeeDAO();
		employeedao.addEmployee(employee);

	}

}
