<%--
  Created by IntelliJ IDEA.
  User: Raynor
  Date: 2017-07-12
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Add job offer</h1>
<f:form method="post" modelAttribute="job">
    <div class="form-label">Offer Title:</div>
    <f:input path="title"/>
    <f:errors path="title"/>

    <div class="form-label">Job description:</div>
    <f:input path="description"/>
    <f:errors path="description"/>

    <div class="form-label">Conditions:</div>
    <f:input path="conditions"/>
    <f:errors path="conditions"/>

    <div class="form-label">Conditions:</div>
    <f:input path="benefits"/>
    <f:errors path="benefits"/>

    <div class="form-label">Conditions:</div>
    <f:input path="salaryLow"/>
    <f:errors path="salaryLow"/>

    <div class="form-label">Conditions:</div>
    <f:input path="salaryHigh"/>
    <f:errors path="salaryHigh"/>




    <p>
        <button type="submit">Add offer</button>
    </p>
</f:form>

<p>
    <a href="/index.html">
        Back to the main page
    </a>
</p>
</body>
</html>
