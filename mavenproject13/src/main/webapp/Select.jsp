<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%
    Boolean auth = (Boolean) session.getAttribute("authenticated");
    if (auth == null || !auth) {
    	response.sendRedirect("ProfessorLogin.jsp");
    }
%>
<link rel="stylesheet" href="resources/css/style.css">
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Questions</title>
</head>
	<body>
	
		<div id="header3">
		<h1 class="display-4">Select What you want to do?</h1>
				<div>
                <a class="btn btn-primary btn-lg" href="CreateQuestions.jsp">Create Questions</a>
                <a class="btn btn-primary btn-lg" href="CreateQuiz.qz">Create Quiz</a>
          </div>  
		</div>

</body>

