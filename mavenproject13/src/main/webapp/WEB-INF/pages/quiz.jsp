<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
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
        
        
    </head>

    <body>
        
        <div class="container">
            <form action ="submittakenquiz.qz">
            
                
           
            <div id="header"> <h1>${qzname}</h1></div>
            <table class="table">
                
            
          
            <input type="hidden" name="sid" value="student1"/>
             <input type="hidden" name="qid" value="${qzid}"/>
              <input type="hidden" name="quizname" value="${qzname}"/>
            <ol type="1">
                
                <c:forEach items="${questionsList}" var="question">
                    <input type="hidden" name="questions" value="${question.id}"/>
                    <input type="hidden" name="ans_${question.id}" value="${question.answer}"/>

                    <li>
                        <div id="accordion" role="tablist" aria-multiselectable="true">
                            <div class="card">
                                <div class="card-header" role="tab" id="headingOne">
                                    <h5 class="mb-0"> <h2>
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne${question.id}" aria-expanded="true" aria-controls="collapseOne${question.id}">
                                                ${question.question}
                                            </a></h2>
                                    </h5>
                                </div>

                                <div id="collapseOne${question.id}" class="collapse" role="tabpanel" aria-labelledby="headingOne">
                                    <div class="card-block">
                                        <ol type="A">
                                            <li> <input type="radio" name="${question.id}" value="Option 1"/> ${question.option1}</li>
                                            <li><input type="radio" name="${question.id}" value="Option 2"/> ${question.option2}</li>
                                            <li><input type="radio" name="${question.id}" value="Option 3"/> ${question.option3}</li>
                                            <li><input type="radio" name="${question.id}" value="Option 4"/> ${question.option4}</li>
                                        
                                        </ol>

                                    </div>
                                </div>
                            </div>
                    </li>
                </c:forEach>
            </ol>
             
             <input type="submit" value="submit quiz"/>
        </form>
        </div>

    </body>
</html>
