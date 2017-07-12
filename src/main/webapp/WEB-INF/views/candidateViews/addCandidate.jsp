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
        First Name:<f:input path="firstName"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="firstName"/>
    </p>
    </p>
    <p>
        Last Name:<f:input path="lastName"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="lastName"/>
    </p>
    </p>
    <p>
        Age:<f:input path="age"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="age"/>
    </p>
    </p>
    <p>
        Hobbies:<f:input path="hobbies"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="hobbies"/>
    </p>
    </p>
    <p>
        E-mail:<f:input path="email"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="email"/>
    </p>
    </p>
    <button type="submit">Add</button>
</f:form>
</body>
</html>
