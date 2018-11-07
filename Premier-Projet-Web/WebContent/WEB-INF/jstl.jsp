<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8080/Premier-Projet-Web/jstl?ligne=10&colonne=20">10/20</a><br/>
<a href="http://localhost:8080/Premier-Projet-Web/jstl?ligne=20&colonne=30">20/30</a><br/>
<a href="http://localhost:8080/Premier-Projet-Web/jstl?ligne=30&colonne=40">30/40</a><br/>
<a href="http://localhost:8080/Premier-Projet-Web/jstl?ligne=40&colonne=50">40/50</a><br/>
<a href="http://localhost:8080/Premier-Projet-Web/jstl?ligne=50&colonne=60">50/60</a><br/>
<a href="http://localhost:8080/Premier-Projet-Web/jstl?ligne=${ligneRandom}&colonne=${colonneRandom}">Random</a><br/>


	<%-- <c:forEach var="boucle" begin="1" end="20" step="1">
		<c:if test="${boucle ne 5}">
			<h1>${boucle}</h1>
		</c:if>

	</c:forEach>
 --%>
	<c:set var="nombre" value="0" />
	<table>
		<tr>
			<c:forEach var="i" begin="1" end="3">
				<c:forEach var="j" begin="1" end="5">
					<td>${nombre = nombre + 1}</td>
				</c:forEach>
		</tr>
		</c:forEach>
		<tr>

		</tr>
	</table>
	<c:set var="nombre" value="0" />

	<table>
		<tr>
			<c:forEach var="i" begin="1" end="${ligne}" step="2">
				<c:forEach var="j" begin="1" end="${colonne}">
					<td>${nombre=nombre+2}</td>
				</c:forEach>
		</tr>
		</c:forEach>

	</table>
	<c:set var="nombre" value="1" />

	<table>
		<tr>
			<c:forEach var="i" begin="1" end="${ligne}">
				<c:forEach var="j" begin="1" end="${colonne}">
					<c:choose>
						<c:when test="${nombre mod 5!=0}">
							<td>${nombre}</td>
						</c:when>
						<c:otherwise>
							<td>*</td>
						</c:otherwise>
					</c:choose>
					<c:set var="nombre" value="${nombre + 1}" />
					<!-- nombre = nombre + 1; -->
				</c:forEach>
		</tr>

		</c:forEach>

	</table>
</body>
</html>