<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    form {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    fieldset {
        border: none;
    }
    legend {
        font-size: 1.5em;
        margin-bottom: 40px;
    }
    label {
        display: block;
       
        font-weight: bold;
    }
    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #007bff;
        border: none;
        border-radius: 4px;
        color: white;
        font-size: 1em;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
		<form action="loginstudent" method="get">
	
	<fieldset>
	<legend>Login</legend>
	<label>UserName
	<input type="email" name="username" placeholder="Enter User Email">
	</label> <br>
	<label>Password
	<input type="password" name="password" placeholder="Enter Password">
	</label> <br>
	
	<input type="submit" value="submit">
	</fieldset>
	</form>
</body>
</html>