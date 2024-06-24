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
    background-color:#80ced6;
    margin: 0;
    padding: 0;
}

.container {
    display: flex;
    align-items: center;
    justify-content: center;
    height: 100vh;
}

form {
    background: #ffffff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 350px;
}

fieldset {
    border: none;
    padding: 0;
    margin: 0;
}

legend {
    font-size: 1.5em;
    margin-bottom: 10px;
}

label {
    display: block;
    margin-bottom: 10px;
    font-weight: bold;
}

input[type="text"],
input[type="password"],
input[type="email"] {
    width: calc(100% - 20px);
    padding: 10px;
    margin-top: 5px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
}

input[type="radio"] {
    margin-right: 10px;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 1em;
    width: 100%;
}

input[type="submit"]:hover {
    background-color: #45a049;
}



</style>
</head>
<body>
		<div class="container">
	<form action="submit" method="get">
	<fieldset>
	<legend>User Registration Form</legend>
	
	<label>User Name
	<input type="text" placeholder="Enter your Name" name="userNamee">
	</label> <br>
	
	<label>User Password
	<input type="password" placeholder="Enter your Name" name="password">
	</label> <br>
	<label>User Email
	<input type="email" placeholder="Enter your Email" name="email">
	</label> <br>
	<label>User Phone
	<input type="text" placeholder="Enter Phone" name="phone">
	</label> <br>
	
	<label>Gender
	<input type="radio" name="gender" value="MALE">Male
	<input type="radio" name="gender" value="FEMALE">Female
	<input type="radio" name="gender" value="OTHER">Other </label> <br>
	<div id="submit">
	<input type="submit" value="Submit">
	</div>
	</fieldset>
	</form>
	</div>
</body>
</html>