<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Creating candidate profile</title>
</head>

<body>
<h1>Create new candidate</h1>
<f:form method="post" modelAttribute="">
    <p>
        First name: <f:input path=""/>
    <p>
        <f:errors path=""/>
    </p>
    </p>
    <p>
        Surname: <f:input path=""/>
    <p>
        <f:errors path=""/>
    </p>
    </p>
    <p>
        email:<f:input path=""/>
    <p>
        <f:errors path=""/>
    </p>
    </p>
    <p>
        age:<f:input path=""/>
    <p>
        <f:errors path=""/>
    </p>
    </p>
    <p>
        hobbies:<f:input path=""/>
    <p>
        <f:errors path=""/>
    </p>
    </p>
    <button type="submit">Create</button>

</f:form>
<p>
    <a href="index.html">
        Main menu
    </a>
</p>


</body>
</html>
