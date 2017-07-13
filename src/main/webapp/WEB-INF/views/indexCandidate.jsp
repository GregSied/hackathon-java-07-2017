<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><s:message code="index.title"/></title>
</head>
<body>

<h1>Candidate</h1>
<h2>index.chooseOption</h2>
<br>
<li>
    <a href="registerCandidate.html">
        <s:message code="index.register"/>
    </a>
</li>
<li>
    <a href="candidateProfile.html">
        <s:message code="index.view"/>
    </a>
</li>
<li>
    <a href="updateCandidate.html">
        <s:message code="index.edit"/>
    </a>
</li>
<li>
    <a href="showListOfEmployers.html">
        <s:message code="index.viewEmployers"/>
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