package com.render.To_Do_List.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.render.To_Do_List.connection.ListConnection;
import com.render.To_Do_List.dto.Listt;

public class ListDao {
	
	Connection connection = ListConnection.getListConnection();
	
	public Listt saveListDao(Listt listt )
	{
		String inserQuery="insert into todolist(name,email,password,gender,phone) values(?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(inserQuery);
			preparedStatement.setString(1, listt.getName());
			preparedStatement.setString(2, listt.getEmail());
			preparedStatement.setString(3, listt.getPassword());
			preparedStatement.setString(4, listt.getGender());
			preparedStatement.setLong(5, listt.getPhone());
			preparedStatement.execute();
			return listt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Listt fetchUserByEmailForLogInDao(String userEmail)
	{
		String selectQuery="select email,password from todolist where email=?";
		
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, userEmail);
			ResultSet resultSet =preparedStatement.executeQuery();
			if(resultSet.next())
			{
				return new Listt(resultSet.getString("email"), resultSet.getString("password"));
			}
			else
			{
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Listt saveTaskDao(Listt listt)
	{
		String insertQuery="insert into task(name,email,task,status) values(?,?,?,?)";
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, listt.getName());
			preparedStatement.setString(2, listt.getEmail());
			preparedStatement.setString(3, listt.getTask());
			preparedStatement.setString(4, listt.getTaskStatus());
			
			preparedStatement.execute();
			return listt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
//	public List<Listt> fetchAllTask(String email)
//	{
//		String selectQuery="select * from task where email=?";
//		try {
//			PreparedStatement preparedStatement =connection.prepareStatement(selectQuery);
//			preparedStatement.setString(1, email);
//			ResultSet resultSet =preparedStatement.executeQuery();
//			List<Listt> listts = new ArrayList<Listt>();
//			while(resultSet.next())
//			{
//				Listt listt= new Listt(resultSet.getString("name"),resultSet.getString("email"),resultSet.getString("task"),resultSet.getString("status"));
//				listts.add(listt);
//			}
//			return listts;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
	public List<Listt> fetchAllTaskDao()
	{
		String selectQuery="select * from task";
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(selectQuery);
			ResultSet resultSet =preparedStatement.executeQuery();
			List<Listt> listts = new ArrayList<Listt>();
			while(resultSet.next())
			{
				Listt listt= new Listt(resultSet.getString("name"),resultSet.getString("email"),resultSet.getString("task"),resultSet.getString("status"));
				listts.add(listt);
			}
			return listts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public int deleteTaskByTasklDao(String task)
	{
		String deleteQuery="delete from task where task=?";
		
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(deleteQuery);
			preparedStatement.setString(1, task);
			return preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	

}
