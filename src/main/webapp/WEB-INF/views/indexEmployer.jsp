<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><s:message code="index.title"/></title>
</head>
<body>

<h1>Employer</h1>
<h2>index.chooseOption</h2>
<br>
<li>
    <a href="registerEmployer.html">
        <s:message code="index.register"/>
    </a>
</li>
<li>
    <a href="showEmployer.html">
        <s:message code="index.view"/>
    </a>
</li>
<li>
    <a href="editEmployer.html">
        <s:message code="index.edit"/>
    </a>
</li>
<li>
    <a href="showListOfCandidate.html">
        <s:message code="index.viewCandidates"/>
    </a>
</li>
<li>
    <a href="show-jobs.html">
        <s:message code="index.viewJobs"/>
    </a>
</li>

<br>
<a href="/">
    <s:message code="index.mainMenu"/>
</a>

</body>
</html>