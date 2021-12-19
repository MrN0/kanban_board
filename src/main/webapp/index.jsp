<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
TEST
    <c:forEach var="i" begin="1" end="5">
        Item <c:out value="${i}" />
    </c:forEach>
</body>
</html>>