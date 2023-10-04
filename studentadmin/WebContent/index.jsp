<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Website Menu</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .menu {
            background-color: #333;
            color: #fff;
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
            color: #fff;
        }

        .login a {
            background-color: #007bff;
            padding: 10px 20px;
            border-radius: 5px;
            text-transform: uppercase;
            color: #fff;
        }

        .login a:hover {
            background-color: #0056b3;
        }

        h1 {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="menu">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="admission.jsp">Admission</a></li>
        </ul>
        <div class="login">
            <a href="login.jsp">Login</a>
        </div>
    </div>
    <div>
        <h1>Welcome to the home page</h1>
    </div>
</body>
</html>
