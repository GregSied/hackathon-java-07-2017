<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><s:message code="indexEmployee.title"/></title>
    <style>
        table {
            width:60%;
        }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: left;
        }
        table#t01 tr:nth-child(even) {
            background-color: #eee;
        }
        table#t01 tr:nth-child(odd) {
            background-color:#fff;
        }
        table#t01 th {
            background-color: black;
            color: white;
        }
    </style>
</head>
<body>

<f:form method="post" modelAttribute="job">
    <p>
    Nazwa:<f:input path="name"/>
    </p>
     <button type="submit">Search</button>
</f:form>

<table id="t01">

    <tr>
        <th>No.</th>
        <th>Id</th>
        <th>Employeer ID</th>
        <th>Job Title</th>
        <th>Job Description</th>
        <th>Conditions</th>
    </tr>
    <tbody>
    <c:forEach items="${jobs}" var="job" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${job.id}</td>
            <td>${job.employeerId}</td>
            <td>${job.Title}</td>
            <td>${job.Description}</td>
            <td>${job.Conditions}</td>
            <td><a href="edit-job.html?id=${job.id}">Edit</a></td>
            <td><a href="remove-job.html?id=${job.id}">Remove</a></td>

                <%--<td>--%>
                <%--<form action="edit-job.html?id=${job.id}">--%>
                <%--<input type ="submit" value="Edit"/>--%>
                <%--</form>--%>
                <%--</td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
<p>
    <a href="/">Main menu</a>
</p>
</body>
</html>
