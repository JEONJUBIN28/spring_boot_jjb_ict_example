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
	<table width="50%" border="1" >
		<tr>
			<td>ename</td>
			<td>sal</td>
			<td>grade</td>
		</tr>
		<c:forEach var="emp" items="${empList}">
				<tr>
					<td>${emp.ename}</td>
					<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
					<td>${emp.salgrade.grade}</td>
				</tr>
		</c:forEach>
	</table>
	
	<c:if test="${pageMaker.prev}">
		<a href="list2${pageMaker.makeQuery(pageMaker.startPage - 1) }"> << </a>
	</c:if>

	<c:forEach var="idx" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
		<a href="list2${pageMaker.makeQuery(idx)}">${idx}</a>
	</c:forEach>


	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<a href="list2${pageMaker.makeQuery(pageMaker.endPage + 1) }"> >> </a>
	</c:if>

</body>
</html>