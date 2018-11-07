<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizzeria Lille</title>
</head>
<body>
<style>
td,tr,th,table{
border: green 5px solid;
border-collapse: collapse;
}
</style>
  <table>
		<tr>
			<th>ID</th>
			<th>NOM</th>
			<th>PRENOM</th>
			<th>EMAIL</th>
			<th>DATE NAISSANCE</th>
			<th>TEL FIXE</th>
			<th>TEL PORTABLE</th>
			<th>NUM CLIENT</th>
			<th>ADRESS</th>
			

		</tr>
		<c:forEach items="${client}" var="client">
			<tr>
				<td>${client.id }</td>
				<td>${client.nom }</td>
				<td>${client.prenom }</td>
				<td>${client.email }</td>
				<td>${client.dateNaissance }</td>
				<td>${client.numTelephone }</td>
				<td>${client.portable }</td>
				<td>${client.numClient }</td>
				<td>${client.adresse }</td>
				<td><a href="detailsclient?id=${client.id }">details client</a></td>
				<td><a href="modifier_client?id=${client.id }">modifier client</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="ajout_client">ajout client</a>
</body>
</html>