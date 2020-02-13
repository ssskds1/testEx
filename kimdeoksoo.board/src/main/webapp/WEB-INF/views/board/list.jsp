<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Idsds</title>
</head>
<body>
<table class="table table-hover">
	<thead>
		<tr class="info">
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일자</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach var="list" items="${boardList}">
			<tr>
			<td>${list.boardNo }</td>
			<td>${list.boardTitle }</td>
			<td>${list.boardContent }</td>
			<td>${list.boardDate }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
