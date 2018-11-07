<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Details</title>
</head>
<body>
<a href="http://localhost:8080/Premier-Projet-Web/users">Retour</a><br/>
<img src="${url}"/>

	<p class="Nom">nom:${nom }</p>
	<p class="Prenom">prenom:${prenom }</p>
	<p class="dateNaissance">dateNaissance:${dateNaissance}</p>
	<p class="telephone">telephone:${telephone }</p>
	<p class="NumeroEtRue">numeroEtRue:${numeroEtRue }</p>
	<p class="ville">ville:${ville }</p>
	<p class="email">email:${email }</p>
	

</body>
</html>