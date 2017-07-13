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

<p>
    Username:<br>
    <f:input path="username"/>
    <f:errors path="username"/>
</p>
    <p>
    Password:<br>
    <f:input path="password"/>
    <f:errors path="password"/>
    </p>

    <p>
    Name of the company:<br>
    <f:input path="name"/>
    <f:errors path="name"/>
    </p>

    <p>
    E-mail:<br>
    <f:input path="email"/>
    <f:errors path="email"/>
    </p>
    <p>
    Address:<br>
    <f:input path="location"/>
    <f:errors path="location"/>
    </p>
    <p>
    Number of employees:<br>
    <f:input type="number" path="numberOfEmployees"/>
    <f:errors path="numberOfEmployees"/>
    </p>

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
