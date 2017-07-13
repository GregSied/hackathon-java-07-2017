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
    Name: ${employer.name}<br>
    Email: ${employer.email}<br>
    Location: ${employer.location}<br>
    Amount of employees in company: ${employer.employeesCount}<br>

</p>
<a href="/candidate">Back to Candidate Menu</a>
</body>
</html>
