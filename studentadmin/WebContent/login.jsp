<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Website Menu</title>
    <link rel="stylesheet" href="css/style.css">
    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    <style>
        /* Add your custom CSS styles here */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }

        .menu {
            background-color: #333;
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
        }

        .logo img {
            width: 100px;
        }

        ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        li {
            margin-right: 20px;
        }

        li:last-child {
            margin-right: 0;
        }

        a {
            text-decoration: none;
            color: white;
            font-weight: bold;
        }

        .login a {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .forms {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        .form {
            margin-bottom: 20px;
        }

        .form-content {
            text-align: center;
        }

        header {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .field {
            margin-bottom: 15px;
        }

        .input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .password {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .button-field button {
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .button-field button:hover {
            background-color: #0056b3;
        }

        .form-link {
            margin-top: 10px;
        }

        .link {
            color: #007bff;
            text-decoration: none;
        }

        .link:hover {
            text-decoration: underline;
        }

        .media-options {
            text-align: center;
        }

        .facebook-icon,
        .google-img {
            vertical-align: middle;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<div class="menu">
    <div class="logo">
        <img src="logo.png" alt="Logo" width="100">
    </div>
    <ul>
        <li><a href="index.jsp">Home</a></li>
        <li><a href="admission.jsp">Admission</a></li>
    </ul>
    <div class="login">
        <a href="login.jsp">Login</a>
    </div>
</div>
<section class="container forms">
    <div class="form login">
        <div class="form-content">
            <header>Login</header>
            <form action="loginServlets" method="post">
                <div class="field input-field">
                    <input type="email" placeholder="Email" class="input" name="username">
                </div>

                <div class="field input-field">
                    <input type="password" placeholder="Password" class="password" name="password">
                    <i class='bx bx-hide eye-icon'></i>
                </div>

                <div class="form-link">
                    <a href="reset_password.jsp" class="forgot-pass">Forgot password?</a>
                </div>

                <div class="field button-field">
                    <button>Login</button>
                </div>
            </form>

            <div class="form-link">
                <span>Don't have an account? <a href="signup.jsp" class="link signup-link">Signup</a></span>
            </div>
        </div>

        <div class="line"></div>

    </div>

</section>
<!-- JavaScript -->
<script src="js/script.js"></script>
</body>
</html>
