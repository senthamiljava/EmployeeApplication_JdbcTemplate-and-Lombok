package com.revature.employee.connection;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	
	public static DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("dev_user");
		ds.setPassword("dev_pwd");
		ds.setUrl("jdbc:mysql://139.59.29.57:3306/sen_db");
		return ds;
	}
	public static JdbcTemplate getjdbcTemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
	}
}
