<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title><s:message code="index.title"/></title>
</head>
<body>

<h1>Choose your role:</h1>
<br>
<li>
    <a href="/candidate">
        Candidate
    </a>
</li>
<li>
    <a href="/employer">
        Employer
    </a>
</li>

<li>
    <a href="/registerEmployer.html">
        Register as Employer
    </a>
</li>

<li>
    <a href="/registerCandidate.html">
        Register as Candidate
    </a>
</li>
</body>
</html>
