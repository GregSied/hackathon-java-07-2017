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
    <a href="<c:url value="/candidate"/>">
        Candidate
    </a>
</li>
<li>
    <a href="<c:url value="/employer"/>">
        Employer
    </a>
</li>

<li>

    <a href="/registerEmployer.html">
        Register as Employer
    </a>
</li>

<li>
    <a href="<c:url value="/candidate/registerCandidate.html"/>">
        Register as Candidate
    </a>
</li>
<img src="https://d2m2lkhawsaq1u.cloudfront.net/uploads/trial/sasha-grey-1-588_1399760242.jpg" style="width:400px;height:560px;">
</body>
</html>
