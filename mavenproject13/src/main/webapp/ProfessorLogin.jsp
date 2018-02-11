<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
			<link rel="stylesheet" href="resources/css/style.css">
			<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	</head>
	
	<body>
		<div id="header">
		<h1>Professor Login</h1>
		</div>
		
		<div>
		<form name="authenticationForm" action="ProfessorAuthenticate" method="post">
			<div class="form-group">
				<label>Login: </label>
				<input type="text" name="firstName" id ="firstName" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Password: </label>
				<input type="password" name="password" id ="password" class="form-control"/>
			</div>
			
            <input type="submit" value="Login"/>
       
          
		</form>
		</div>
		
	</body>
</html>

