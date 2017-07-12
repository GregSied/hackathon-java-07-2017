<%--
  Created by IntelliJ IDEA.
  User: Raynor
  Date: 2017-07-12
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Najlepsze oferty pracy</title>
</head>
<body>

<p>Zarejestruj się lub zaloguj na swoje konto:</p>
<br>
<li>
    <a href="login-as-employee.html">
        <s:message code="index.loginAsEmployee"/>
    </a>
</li>

<li>
    <a href="login-as-employer.html">
        <s:message code="index.loginAsEmployer"/>
    </a>
</li>

<li>
    <a href="registerEmployer.html">
        Zarejestruj się jako Pracodawca
    </a>
</li>

<li>
    <a href="registerCandidate.html">
        Zarejestruj się jako Kandydat
    </a>
</li>
<br>
<p>Szukaj pracy lub pracowników:</p>
<br>

<li>
    <a href="look-for-job-offers.html">
        <s:message code="index.lookForJobOffers"/>
    </a>
</li>

<li>
    <a href="look-for-employees.html">
        <s:message code="index.lookForEmployees"/>
    </a>
</li>






</body>
</html>
