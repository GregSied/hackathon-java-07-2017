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
</head>
<body>
<h1>ListOfCandidate</h1>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Name</th>
        <th>Last Name</th>
    </tr>
    </thead>
<tbody>
<c:forEach items="${allCandidates}" var="candidate" varStatus="status">
    <tr>
    <td>${status.index + 1}</td>
    <td>${candidate.name}</td>
    <td>${candidate.LastName}</td>
        <td><a href="<c:url value="/message/user/${candidate.id}"/>">SendMesssage</a></td>
    </tr>
</c:forEach>
</tbody>
</table>
<h1>ListOfEmployer</h1>
<table>
    <thead>
    <tr>
        <th>Lp.</th>
        <th>Id</th>
        <th>Name</th>
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
