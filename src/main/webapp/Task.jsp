<%@page import="java.util.List"%>
<%@page import="com.render.To_Do_List.dto.Listt"%>
<%@page import="com.render.To_Do_List.dao.ListDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: 'Arial', sans-serif;
        background-color: #e9ecef;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    form {
        background-color: #fff;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        width: 350px;
        box-sizing: border-box;
    }
    label {
        display: block;
        margin-bottom: 10px;
        font-weight: bold;
        color: #333;
    }
    input[type="text"],
    input[type="email"] {
        width: calc(100% - 16px);
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background-color: #007bff;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 1em;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
    a {
        display: block;
        text-align: center;
        margin-top: 20px;
        color: #007bff;
        text-decoration: none;
        transition: color 0.3s ease;
    }
    a:hover {
        color: #0056b3;
    }
</style>
</head>
<body>
			
			<form action="tasksub" method="get">
			Name : <input type="text" placeholder="Enter your name" name="userName"> <br> <br>
			Email : <input type="email" placeholder="Enter your email" name="email"> <br> <br>
			Task : <input type="text" placeholder="Enter your task" name="task"> <br> <br>
			<input type="submit" value="submit">  <br> <br>
			
			<a href="display.jsp">Display All Tasks</a>
			
			</form>
			
			
			
</body>
</html>