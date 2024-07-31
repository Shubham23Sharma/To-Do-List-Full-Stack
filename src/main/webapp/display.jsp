<%@page import="com.render.To_Do_List.dto.Listt"%>
<%@page import="java.util.List"%>
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
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        line-height: 1.6;
        background-color: #f8f9fa;
        margin: 0;
        padding: 20px;
    }
    .container {
        max-width: 800px;
        margin: auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    table, th, td {
        border: 1px solid #dee2e6;
    }
    th, td {
        padding: 12px;
        text-align: left;
    }
    th {
        background-color: #007bff;
        color: #fff;
    }
    td a {
        display: inline-block;
        padding: 6px 12px;
        
        
        text-decoration: none;
        border-radius: 4px;
        transition: background-color 0.3s;
    }
    td a:hover {
       
    }
    td button {
        padding: 6px 12px;
        background-color: #17a2b8;
        color: #fff;
        border: none;
        cursor: pointer;
        border-radius: 4px;
        transition: background-color 0.3s;
    }
  
    
 	
</style>
</head>
<body>

		<% 
			/*  ListDao dao = new ListDao(); 
			String email=request.getParameter("email");
			List<Listt> lists=dao.fetchAllTask(email); */
			
			ListDao dao = new ListDao();
			List<Listt> lists =dao.fetchAllTaskDao();
			
			
		%>
		
		 
		
			
			
			<!-- <form action="display" method="get">
			Please enter email to get All Task Detail	<input name="email" placeholder="email">
			<input type="submit" value="submit">
			</form> -->
			
			
			<table border="2px solid black">
				<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Task</th>
				<th colspan="2">Action</th>
				</tr>
				
				 <% for(Listt list1:lists) { %> 
				<tr>
				
				<td><%=list1.getName() %></td>
				<td><%=list1.getEmail() %></td>
				<td><%=list1.getTask() %></td>
				<td><a href="delete?task=<%=list1.getTask()%>"><button >Delete</button></a></td>
				<td><button><%=list1.getTaskStatus() %></button></td>
				
				
        </tr>
        <% } %>
       
			</table>
			
</body>
</html>