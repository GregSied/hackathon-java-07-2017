<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.07.2017
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Candidate edited</title>
</head>
<body>
<p>
    Name: ${candiate.firstName}
    Last Name: ${candidate.lastName}
    Age: ${candiadte.age}
    Hobbies ${candidate.hobbies}
    Email ${candidate.candidateEmail}

</p>

<p>
    <a href="<c:url value="/"/>">
        Main menu
    </a>
</p>

</body>
</html>
