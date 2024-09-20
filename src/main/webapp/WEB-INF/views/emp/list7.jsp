<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 리스트</h1>
	<table width="50%" border="1">
		<tr>
			<td>dname</td>
			<td>ename</td>
			<td>job</td>
			<td>sal</td>
			<td>loc</td>
			<td>sal 등급</td>
		</tr>
		<c:forEach var="vo" items="${empList}">
			<tr>
				<td>${vo.dept.dname}</td>
				<td>${vo.emp.ename}</td>
				<td>${vo.emp.job}</td>
				<td><fmt:formatNumber value="${vo.emp.sal}" type="number" /></td>
				<td>${vo.dept.loc}</td>
				<td>${vo.salgrade.grade}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>