<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Employer list</title>
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
<table id="t01">
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Location</th>
        <th>Number of employees</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allEmployers}" var="employer" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${employer.id}</td>
            <td><a href="displayEmployerPage.html?id=${employer.id}">${employer.name}</a></td>
            <td>${employer.email}</td>
            <td>${employer.location}</td>
            <td>${employer.employeesCount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/candidate">Back to Candidate menu</a>
</body>
</html>
