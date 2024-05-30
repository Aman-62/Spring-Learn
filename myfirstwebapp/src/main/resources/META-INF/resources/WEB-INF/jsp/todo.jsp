<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
        <title>Todos</title>
    </head>
    <body>
        <div class="container">
            <h2>Enter Todo Details</h2>
            <hr>

            <form:form method="POST" modelAttribute="todo">
                <label for="desc" class="form-label">Description</label>
                <form:input type="text" path="description" id="desc" class="form-control"/>
                <form:errors path="description" class="text-danger"></form:errors>
                
                <form:input type="hidden" path="id"></form:input>
                <form:input type="hidden" path="done"></form:input>

                <button type="submit" class="btn btn-primary mt-3">Submit</button>
            </form:form>
        </div>
    </body>
</html>
