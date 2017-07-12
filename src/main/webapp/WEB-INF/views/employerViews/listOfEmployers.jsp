<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Employer list</title>
</head>
<body>
<table>
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
            <td>${employer.name}</td>
            <td>${employer.email}</td>
            <td>${employer.location}</td>
            <td>${employer.employeesCount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/">Back to main menu</a>
</body>
</html>
