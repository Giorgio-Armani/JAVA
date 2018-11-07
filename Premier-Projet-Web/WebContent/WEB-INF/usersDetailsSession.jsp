<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Details</title>
</head>
<body>
<a href="http://localhost:8080/Premier-Projet-Web/UsersSessionServlet">Retour</a><br/>
<img src="${personne.url}"/>

	<p class="Nom">nom:${personne.nom }</p>
	<p class="Prenom">prenom:${personne.prenom }</p>
	<p class="dateNaissance">dateNaissance:${personne.dateNaissance}</p>
	<p class="telephone">telephone:${personne.telephone }</p>
	<p class="NumeroEtRue">numeroEtRue:${personne.numeroEtRue }</p>
	<p class="ville">ville:${personne.ville }</p>
	<p class="email">email:${personne.email }</p>
	

</body>
</html>