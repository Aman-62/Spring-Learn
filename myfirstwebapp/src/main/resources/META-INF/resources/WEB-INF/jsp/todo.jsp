<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link
            rel="stylesheet"
            href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
        />
        <link
            rel="stylesheet"
            href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
        />
        <title>Todos</title>
    </head>
    <body>
        <%@ include file="common/navigation.jspf" %>
        <div class="container">
            <h2>Enter Todo Details</h2>
            <hr />

            <form:form method="POST" modelAttribute="todo">
                <fieldset class="mb-3">
                    <form:label path="description" for="desc" class="form-label"
                        >Description</form:label
                    >
                    <form:input
                        path="description"
                        type="text"
                        id="desc"
                        class="form-control"
                    />
                    <form:errors
                        path="description"
                        class="text-danger"
                    ></form:errors>
                </fieldset>

                <fieldset class="mb-3">
                    <form:label
                        path="targetDate"
                        for="targetDate"
                        class="form-label"
                        >Target Date</form:label
                    >
                    <form:input
                        path="targetDate"
                        type="text"
                        id="targetDate"
                        class="form-control"
                    />
                    <form:errors
                        path="targetDate"
                        class="text-danger"
                    ></form:errors>
                </fieldset>

                <form:input type="hidden" path="id"></form:input>
                <form:input type="hidden" path="done"></form:input>

                <button type="submit" class="btn btn-primary mt-3">
                    Submit
                </button>
            </form:form>
        </div>

        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
        <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript">
            $("#targetDate").datepicker({
                format: "yyyy-mm-dd",
            });
        </script>
    </body>
</html>
