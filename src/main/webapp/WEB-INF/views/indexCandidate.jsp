<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><s:message code="index.title"/></title>
</head>
<body>

<h1>Candidate</h1>
<h2>Choose option:</h2>
<br>
<li>
    <a href="add-candidate.html">
        <s:message code="index.register"/>
    </a>
</li>
<li>
    <a href="candidateProfile.html">
        <s:message code="indexCandidate.view"/>
    </a>
</li>
<li>
    <a href="updateCandidate.html">
        <s:message code="indexCandidate.edit"/>
    </a>
</li>
<br>
    <a href="/">
        <s:message code="index.mainMenu"/>
    </a>

</body>
</html>