<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Employer edited</title>
</head>

<body>


<p>
    Name: ${employer.employerName}
    Email: ${employer.employerEmail}
    Location: ${employer.location}
    Amount of employees in company: ${employer.employeesNumber}

</p>

<p>
    <a href="index.html">
        Main menu
    </a>
</p>


</body>
</html>
