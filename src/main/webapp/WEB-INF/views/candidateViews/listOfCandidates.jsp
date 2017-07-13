
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
</head>
<body>
<table>
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
<a href="/">Back to main menu</a>

</body>
</html>
