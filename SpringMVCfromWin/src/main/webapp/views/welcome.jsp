<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${requestScope.errors}" var="error">
 ${error.getDefaultMessage()},
</c:forEach>
<h1>欢迎回来！</h1><br/>
${requestScope.err}
</body>
</html>