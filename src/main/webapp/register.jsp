<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<<<<<<< HEAD

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
=======
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Register</title>
</head>
<body>
<br/>
    <section>
        <div class="card-box col-12 col-md-5 my-5 mx-auto p-3 shadow shadow-md align-item-center bg-white">
            <div class="text-center">
                <h3>WELCOME!</h3>
                <small>Don't have an account? <a href="index">Sign in</a></small>
            </div><br>
            <form action="includes/scripts.php" method="POST">
                <div class="mb-3">
                    <label for="first_name" class="form-label">First Name</label>
                    <input type="text" name="first_name" id="first_name" class="form-control" placeholder="Add Your First Name" min="4" max="50" required>
                </div>
                <div class="mb-3">
                    <label for="last_name" class="form-label">Last Name</label>
                    <input type="text" name="last_name" id="last_name" class="form-control" placeholder="Add Your Last Name" min="4" max="50" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" name="email" id="email" class="form-control" placeholder="Add Your Email" min="4" max="50" required>
>>>>>>> JRO-2
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" name="password" id="password" class="form-control" placeholder="******" min="8" max="50" required>
                </div>
<<<<<<< HEAD
=======
                <div class="mb-3">
                    <label for="password_confirmation" class="form-label">Password Confirmation</label>
                    <input type="password" name="password_confirmation" id="password_confirmation" class="form-control" placeholder="******" min="8" max="50" required>
                </div>
>>>>>>> JRO-2
                <button type="submit" name="login" class="btn btn-primary col-12">Sign In</button>
            </form>
        </div>
    </section>
<<<<<<< HEAD

=======
>>>>>>> JRO-2
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>