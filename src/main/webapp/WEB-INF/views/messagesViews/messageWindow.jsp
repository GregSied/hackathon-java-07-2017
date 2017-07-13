<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Message</title>
</head>
<body>
<f:form method="post" modelAttribute="sendMessageForm">
    <f:textarea path="message" />
    <p>
        <button type="submit">Send</button>
    </p>
</f:form>
</body>
</html>
