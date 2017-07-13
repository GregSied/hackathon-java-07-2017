<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Zarejestruj się jako pracodawca</title>
</head>
<body>
<h1>Zarejestruj się jako pracodawca</h1>


<f:form method="post" modelAttribute="employerform">


    Username
    <f:input path="username"/>
    <f:errors path="username"/>

    Password:
    <f:input path="password"/>
    <f:errors path="password"/>


    Name of the company:
    <f:input path="name"/>
    <f:errors path="name"/>

    E-mail:
    <f:input path="email"/>
    <f:errors path="email"/>

    Address:
    <f:input path="location"/>
    <f:errors path="location"/>

    Number of employees:
    <f:input type="number" path="numberOfEmployees"/>
    <f:errors path="numberOfEmployees"/>


    <p>
        <button type="submit">Add employer</button>
    </p>
</f:form>

<p>
    <a href="/index.html">
        Back to the main page
    </a>
</p>
</body>
</html>
