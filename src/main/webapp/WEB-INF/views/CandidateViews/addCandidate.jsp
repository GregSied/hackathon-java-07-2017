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
        Name:<f:input path="candidateName"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="candidateName"/>
    </p>
    </p>
    <p>
        Surname:<f:input path="candidateSurname"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="candidateSurname"/>
    </p>
    </p>
    <p>
        Car:<f:input path="car"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="car"/>
    </p>
    </p>
    <p>
        Phonenumber:<f:input path="phonenumber"/>
    <p style="color:#ff0000;font-weight:bold">
        <f:errors path="phonenumber"/>
    </p>
    </p>
    <f:hidden path="id"/>
    <button type="submit">Add</button>
</f:form>
</body>
</html>
