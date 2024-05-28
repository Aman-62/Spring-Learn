<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
        <title>Todos</title>
    </head>

    <body>
        <div class="container">
            <h2>Your Todos</h2>

            <hr>

            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done?</th>
                        <th>Actions</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${todos}" var="todo" >

                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                        </tr>

                    </c:forEach>
                    
                </tbody>
            </table>

            <a href="add-todo" class="btn btn-success">Add Todo</a>
        </div>

        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>
