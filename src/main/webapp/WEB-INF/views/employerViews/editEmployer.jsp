<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Editing employer</title>
</head>

<body>
<body>
<h1>Edit employer</h1>
<f:form method="post" modelAttribute="employer">
    <div>Name: </div>
    <f:input path="name"/>
    <p>
        <f:errors path="name"/>
    </p>
    <div>Email: </div>
    <f:input path="email"/>
    <p>
        <f:errors path="email"/>
    </p>

    <div>Location: </div>
    <f:input path="location"/>
    <p>
        <f:errors path="location"/>
    </p>

    <div>Amount of employees in company: </div>
    <f:input path="employeesCount"/>
    <p>
        <f:errors path="employeesCount"/>
    </p>


    <p>
        <button type="submit">Change</button>
    </p>
</f:form>

<p>
    <a href="index.html">
        Main menu
    </a>
</p>

</body>

</body>
</html>