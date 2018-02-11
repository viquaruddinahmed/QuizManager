<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" href="resources/css/style.css">
        <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Create Questions</title>
    </head>
    <body>
        <div id="header4">
            <h1 class="display-4">Add Questions!!!!</h1>
        </div>
        <div>
            <form name="CreateQuestions" action="addquestion.qz" method="post">
                <div class="form-group">
                    <label id="lsize">Question? </label>
                    <textarea class="form-control" rows="7" id="question" name="question"></textarea>
                </div>
                <div class="form-group">
                    <label id="osize">Option 1: </label>
                    <input type="text" name="option1" id ="option1" class="form-control"/>
                </div>
                <div class="form-group">
                    <label id="osize">Option 2: </label>
                    <input type="text" name="option2" id ="option2" class="form-control"/>
                </div>
                <div class="form-group">
                    <label id="osize">Option 3: </label>
                    <input type="text" name="option3" id ="option3" class="form-control"/>
                </div>
                <div class="form-group">
                    <label id="osize">Option 4: </label>
                    <input type="text" name="option4" id ="option4" class="form-control"/>
                </div>

                <div class="form-group">
                    <label id="osize">Correct Answer:</label>
                    <select class="form-control" id="answer" name="answer">
                        <option>Please Select Any Answer</option>
                        <option>Option 1</option>
                        <option>Option 2</option>
                        <option>Option 3</option>
                        <option>Option 4</option>
                    </select>
                </div>
                <input type="submit" value="Submit" />
            </form>
        </div>


    </body>
</html>