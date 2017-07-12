<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Candidate</title>
</head>

<body>
<table>
    <thead>
    <tr>

        <th>Id: </th>
        <th>Name: </th>
        <th>Surname: </th>
        <th>Age: </th>
        <th>Hobbies: </th>
        <th>Email: </th>
    </tr>
    </thead>
    <tbody>

        <tr>

            <td>${candidate.id}</td>
            <td>${candidate.firstName}</td>
            <td>${candidate.lastName}</td>
            <td>${candidate.age}</td>
            <td>${candidate.hobbies}</td>
            <td>${candidate.email}</td>

        </tr>

    </tbody>
</table>
<p>
    <a href="index.html">
        Main menu
    </a>
</p>

</body>
</html>
