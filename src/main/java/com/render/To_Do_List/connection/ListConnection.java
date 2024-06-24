package com.render.To_Do_List.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ListConnection {
	
	public static Connection getListConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/to-do-list";
			String user="root";
			String pass="root";
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
