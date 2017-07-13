
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Candidate added!</title>
</head>
<body>
<h2>Success!</h2>
<p>
    Hello ${candidate.firstName} ${candidate.lastName}!!<br>
    You have been registered!
</p>

<p>
    <a href="<c:url value="/"/>">
        Back to the main page
    </a>
</p>

</body>
</html>
