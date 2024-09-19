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
			<td>deptno</td>
			<td>empno</td>
			<td>ename</td>
			<td>job</td>
			<td>mgr</td>
			<td>hiredate2</td>
			<td>sal</td>
			<td>comm</td>
			<td>dname(부서이름)</td>
			<td>loc(부서번호)</td>
		</tr>
		<c:forEach var="emp" items="${empList}">
			<tr>
				<td>${emp.deptno}</td>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<%-- <td>${emp.sal}</td> --%>
				<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
                <!-- 숫자 1000을 1,000으로 표시하는 태그 -->
				<td>${emp.comm}</td>
				<td>${emp.dname}</td>
				<td>${emp.loc}</td>
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