
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.07.2017
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ListCandidate</title>
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
        <th>Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Hobbies</th>
        <th>Email</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allCandidates}" var="candidate" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td>${candidate.firstName}</td>
            <td>${candidate.lastName}</td>
            <td>${candidate.age}</td>
            <td>${candidate.hobbies}</td>
            <td>${candidate.email}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/employer">Back to Employer Menu</a>

</body>
</html>
