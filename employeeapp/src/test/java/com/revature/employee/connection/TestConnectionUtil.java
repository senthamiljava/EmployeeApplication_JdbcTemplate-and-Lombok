package com.revature.employee.connection;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnectionUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   JdbcTemplate jdbcTemplate=ConnectionUtil.getjdbcTemplate();
   System.out.println(jdbcTemplate);
	}

}
