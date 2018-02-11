
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
    <head>
        
        <style>
            body{
	margin: 0 1% !important;
	padding: 10px !important;
}
#header{
	width: 100%;
	background-color: SkyBlue;
	padding: 50px 70px;
}

#header h1{
	text-align: center;
	font-family: inherit;
	font-weight: 500;
	line-height: 1.1;
	font-size: 63px;
	vertical-align: center;
}

#header2{
	width: 100%;
	background-color: LightGrey;
	padding: 50px 70px;
}

#header3{
	width: 100%;
	background-color: SpringGreen;
	padding: 50px 70px;
}

#header4{
	font-family: Times New Roman;
	text-align: center;
	width: 100%;
	font-weight: 500;
	background-color: SpringGreen;
	padding: 50px 70px;
}

#lsize{
	font-family: Arial;
	font-weight: 500;
	line-height: 1.1;
	font-size: 30px;
}

#osize{
		font-size: 20px;
}
            
            </style>
        
        
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
        
        
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!--  <link rel="stylesheet" href="/resources/styles.css">  -->



        
        
    </head>
    <body>
        <div class="container">
            <div id="header"> <h1>available Quiz</h1></div>
            <table class="table">
          
                <tr><th>Quiz id</th><th> Quiz Name</th>   </tr>
            
               <c:forEach items="${quizlist}" var="qz">
               
                 <tr><td> <a href="takeqz.qz?qzid=${qz.quizid}&qzname=${qz.quizname}">${qz.quizid}</a>  </td> <td> ${qz.quizname} </td>   </tr>
             
                 
             </c:forEach>
            
            
            
            
        </table>
        </div>
    </body>
    
    
    
</html>
