<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<<<<<< HEAD
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

=======
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
>>>>>>> 153baa72dd109bd70abcae3271771778340e6eb3
<html>
<head>
    <title>Edit Candidate</title>
</head>
<body>
<h1>Edit employer</h1>
<f:form method="post" modelAttribute="candidate">
    <div>Name:</div>
    <f:input path="firstName"/>
    <p>
        <f:errors path="firstName"/>
    </p>
    <div>Last Name:</div>
    <f:input path="lastName"/>
    <p>
        <f:errors path="lastName"/>
    </p>

    <div>Age:</div>
    <f:input path="age"/>
    <p>
        <f:errors path="age"/>
    </p>

    <div>Hobbies:</div>
    <f:input path="hobbies"/>
    <p>
        <f:errors path="hobbies"/>
    </p>

    <div>Email:</div>
    <f:input path="email"/>
    <p>
        <f:errors path="email"/>
    </p>

    <p>
        <button type="submit">Change</button>
    </p>
</f:form>

<p>
    <a href="<c:url value="/"/>">
        Main menu
    </a>
</p>

</body>
</html>
