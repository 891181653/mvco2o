package com.imooc.o2o.dao;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		 String driverName = "com.mysql.cj.jdbc.Driver";

		String dbURL = "jdbc:mysql://127.0.0.1:3306/o2o?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";

		 String userName = "root";

		String userPwd = "admin";
Connection dbConn = null;
 try {
	Class.forName(driverName);
	dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
	System.out.println("testing 链接成功");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


		
	}

}
