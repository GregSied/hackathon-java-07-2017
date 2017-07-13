<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add candidate</title>
</head>
<body>
<h1>Add new candidate</h1>
<f:form method="post" modelAttribute="candidateForm">

    <p>
        Username:<br>
        <f:input path="username"/>
        <f:errors path="username"/>
    </p>

    <p>
        Password: <br>
        <f:input path="password"/>
        <f:errors path="password"/>
    </p>


    <p>
        First Name:<br>
        <f:input path="firstName"/>
        <f:errors path="firstName"/>
    </p>
    <p>
        Last Name:<br>
        <f:input path="lastName"/>
        <f:errors path="lastName"/>
    </p>
    <p>
        Age:<br>
        <f:input type="number" path="age"/>
        <f:errors path="age"/>
    </p>
    <p>
        Hobbies:<br>
        <f:input path="hobbies"/>
        <f:errors path="hobbies"/>
    </p>
    <p>
        E-mail:<br>
        <f:input path="email"/>
        <f:errors path="email"/>
    </p>
    <button type="submit">Add</button>
</f:form>

<p>
    <a href="<c:url value="/"/>">
        Back to the main page
    </a>
</p>
</body>
</html>
