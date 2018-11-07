<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription Post</title>
</head>
<body>
<h1>Nom : ${nom }</h1>
<h1>Prenom : ${prenom }</h1>
<h1>Date de Naissance: ${dateNaissance }</h1>
<h1>Rue : ${rue }</h1>
<h1>Ville : ${ville }</h1>
<h1>Gender : ${gender }</h1>
<h1>Telephone : ${telephone }</h1>
<h1>Departement : ${departement }</h1>
<h1>Email : ${email }</h1>


<a href="inscription">Retour</a>
</body>
</html>