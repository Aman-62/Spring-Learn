<html>
    <head>
        <link
            rel="stylesheet"
            href="webjars/bootstrap/5.3.3/css/bootstrap.min.css"
        />
        <title>Login page</title>
    </head>
    <body>
        <div class="container">
            <h2>Login</h2>

            <hr />

            <form method="POST">
                <label for="name" class="form-label">Name</label>
                <input type="text" name="name" id="name" class="form-control" />

                <label for="pass" class="form-label">Password</label>
                <input
                    type="password"
                    name="password"
                    id="pass"
                    class="form-control"
                />

                <div class="text-danger">${errorMessage}</div>

                <button type="submit" class="btn btn-primary mt-3">
                    Submit
                </button>
            </form>
        </div>

        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>
