<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Zarejestruj się jako pracodawca</title>
</head>
<body>
<h1>Zarejestruj się jako pracodawca</h1>
<f:form method="post" modelAttribute="employer">
    <div class="form-label">Name of the company:</div>
    <f:input path="name"/>
    <f:errors path="name"/>

    <div class="form-label">E-mail:</div>
    <f:input path="email"/>
    <f:errors path="email"/>

    <div class="form-label">Adress:</div>
    <f:input path="location"/>
    <f:errors path="location"/>

    <div class="form-label">Number of employees:</div>
    <f:input type = "number" path="employeesCount"/>
    <f:errors path="employeesCount"/>



    <p>
        <button type="submit">Add employee</button>
    </p>
</f:form>

<p>
    <a href="/index.html">
        Back to the main page
    </a>
</p>
</body>
</html>
