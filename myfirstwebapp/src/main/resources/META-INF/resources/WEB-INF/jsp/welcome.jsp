<html>
    <head>
        <link
            rel="stylesheet"
            href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
        />
        <title>Welcome page</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <div class="container">
            <h2>Welcome ${name}</h2>
            <hr />
            <p class="blockquote-footer">
                <a href="list-todos">Manage</a> your todos
            </p>
        </div>

        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>
