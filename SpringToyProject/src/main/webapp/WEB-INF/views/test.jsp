<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>
	<!-- Model의 list를 받아와서 test라는 변수명으로 사용한다. -->
	<c:forEach items="${list}" var="test">
		int = ${test.test_int}<br><!-- list안에 있는 JavaBean객체의 변수를 가져옴 -->
		text = ${test.test_text}<br>
		date = ${test.test_date}<br>
		double = ${test.test_double}<br>
	</c:forEach>
</body>
</html>