<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.07.2017
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Candidate</title>
</head>
<body>
<h1>Edit employer</h1>
<f:form method="post" modelAttribute="candidate">
    <div>Name: </div>
    <f:input path="firstName"/>
    <p>
        <f:errors path="firstName"/>
    </p>
    <div>Last Name: </div>
    <f:input path="lastName"/>
    <p>
        <f:errors path="lastName"/>
    </p>

    <div>AGE: </div>
    <f:input path="age"/>
    <p>
        <f:errors path="age"/>
    </p>

    <div>Hobbies </div>
    <f:input path="hobbies"/>
    <p>
        <f:errors path="hobbies"/>
    </p>

    <div>Email </div>
    <f:input path="candidateEmail"/>
    <p>
        <f:errors path="candidateEmail"/>
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
</html>