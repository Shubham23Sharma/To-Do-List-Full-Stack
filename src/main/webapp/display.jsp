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