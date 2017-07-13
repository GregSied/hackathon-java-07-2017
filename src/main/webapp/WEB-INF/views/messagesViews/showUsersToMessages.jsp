<%--
  Created by IntelliJ IDEA.
  User: lary8
  Date: 13.07.2017
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Messages</title>
    <style>
        table {
            width:30%;
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
<h1>ListOfCandidate</h1>
<table id="t01">
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Name</th>
        <th>Last Name</th>
        <th>Send Message</th>
    </tr>
    </thead>
<tbody>
<c:forEach items="${allCandidates}" var="candidate" varStatus="status">
    <tr>
    <td>${status.index + 1}</td>
    <td>${candidate.firstName}</td>
    <td>${candidate.lastName}</td>
        <td><a href="<c:url value="/message/user/${candidate.id}"/>">SendMesssage</a></td>
    </tr>
</c:forEach>
</tbody>
</table>
<h1>ListOfEmployer</h1>
<table id="t01">
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Name</th>
        <th>Send Message</th>
    </tr>
    </thead>
<tbody>
<c:forEach items="${allEmployers}" var="employer" varStatus="status">
    <tr>
    <td>${status.index + 1}</td>
    <td>${employer.id}</td>
    <td>${employer.name}</td>
        <td><a href="<c:url value="/message/user/${employer.id}"/>">SendMesssage</a></td>
    </tr>
</c:forEach>
</tbody>
</table>



<a href="/">Back to main menu</a>

</body>
</html>
