<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title><s:message code="index.title"/></title>
</head>
<body>

<h1>Employer menu</h1>
<h2><s:message code="index.chooseOption"/></h2>
<br>

<li>
    <a href="<c:url value="/employer/show"/>">
        <s:message code="index.view"/>
    </a>
</li>
<li>
    <a href="<c:url value="/employer/edit"/>">
        <s:message code="index.edit"/>
    </a>
</li>
<li>
    <a href="<c:url value="/employer/list"/>">
        <s:message code="index.viewCandidates"/>
    </a>
</li>
<li>
    <a href="/job/list">
        <s:message code="index.viewJobs"/>
    </a>
</li>
<li>
    <a href="<c:url value="/message/users"/>">
        <s:message code="employer.sendMessage"/>
    </a>
</li>

<br>
<a href="<c:url value="/"/>">
    <s:message code="index.mainMenu"/>
</a>

</body>
</html>