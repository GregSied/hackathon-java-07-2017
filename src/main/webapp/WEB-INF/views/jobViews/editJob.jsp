<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Editing job</title>
</head>

<body>
<body>
<h1>Edit job</h1>
<f:form method="post" modelAttribute="job">
    <div>Title: </div>
    <f:input path="jobTitle"/>
    <p>
        <f:errors path="jobTitle"/>
    </p>
    <div>Description: </div>
    <f:input path="jobDescription"/>
    <p>
        <f:errors path="jobDescription"/>
    </p>

    <div>Conditions: </div>
    <f:input path="conditions"/>
    <p>
        <f:errors path="conditions"/>
    </p>

    <div>Benefits </div>
    <f:input path="benefits"/>
    <p>
        <f:errors path="benefits"/>
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