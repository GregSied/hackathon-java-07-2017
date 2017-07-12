<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Job</title>
</head>
<body>
<h1>This is the data for job: ${foundJob.jobTitle}</h1>

Title: ${foundJob.title}<br>
Description: ${foundJob.description}<br>
Conditions: ${foundJob.conditions}<br>
Benefits: ${foundJob.benefits}<br>
Salary: between ${foundJob.salaryLow} and ${foundJob.salaryHigh}

<p>
    <a href="/index.html">
        Back to the main page
    </a>
</p>
</body>
</html>
