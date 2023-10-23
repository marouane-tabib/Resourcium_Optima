<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Sign in!" %>
</h1>
<br/>
    <section>

        <div class="card-box col-12 col-md-5 my-5 mx-auto p-3 shadow shadow-md align-item-center bg-white">
            <div class="text-center">
                <h3>WELCOME BACK!</h3>
                <small>Don't have an account? <a href="index">Sign up</a></small>
            </div><br>
            <form action="includes/scripts.php" method="POST">
                <div class="mb-3">
                    <label for="username" class="form-label">User Name</label>
                    <input type="text" name="username" id="username" class="form-control" placeholder="Add Your User Name" min="4" max="50" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" name="password" id="password" class="form-control" placeholder="******" min="8" max="50" required>
                </div>
                <button type="submit" name="login" class="btn btn-primary col-12">Sign In</button>
            </form>
        </div>
    </section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>