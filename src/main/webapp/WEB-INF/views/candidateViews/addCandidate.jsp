<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add candidate</title>
</head>
<body>
<h1>Add new candidate</h1>
<f:form method="post" modelAttribute="candidate">
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
</body>
</html>
