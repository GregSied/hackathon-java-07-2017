<%--
  Created by IntelliJ IDEA.
  User: Lukasz
  Date: 12.07.2017
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Profil pracodawcy</title>
</head>
<body>
<p>
    Name: ${employer.employerName}<br>
    Email: ${employer.employerEmail}<br>
    Location: ${employer.location}<br>
    Amount of employees in company: ${employer.employeesNumber}<br>

</p>
<a href="/">Back to main menu</a>
</body>
</html>
