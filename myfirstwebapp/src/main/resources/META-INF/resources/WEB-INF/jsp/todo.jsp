<html>
    <head>
        <link rel="stylesheet" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
        <title>Todos</title>
    </head>
    <body>
        <div class="container">
            <h2>Enter Todo Details</h2>
            <hr>

            <form method="POST">
                <label for="desc" class="form-label">Description</label>
                <input type="text" name="description" id="desc" class="form-control"/>
                
                <button type="submit" class="btn btn-primary mt-3">Submit</button>
            </form>
        </div>
    </body>
</html>
