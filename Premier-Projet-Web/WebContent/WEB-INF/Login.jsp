<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<c:out value = "Login: ${Login}"/></br>
<c:out value = "Password : ${password}"/></br>
<c:out value = "10 + 5 : ${nombre1 + nombre2}"/></br>
<c:out value = "10 * 5 : ${nombre1 * nombre2}"/></br>
<c:out value = "10 / 5 : ${nombre1 / nombre2}"/></br>
<c:out value = "10 - 5 : ${nombre1 - nombre2}"/></br>

10 gt 5 : ${10 gt 5}</br>
10 lt 5 : ${10 lt 5}</br>
5 gt 10 : ${5 gt 10}</br>
15 le 5 : ${15 le 5}</br>
8 != 5 : ${8 != 5}</br>
10 == 5 : ${10 eq 5}</br>


Nom : ${michael.nom}</br>
Prenom : ${michael.prenom}</br>
Date de Naissance : ${michael.dateNaissance}</br>
Numero de Téléphone : ${michael.telephone}</br>
Numéro et Nom dela Rue : ${michael.numeroEtRue}</br>
Ville : ${michael.ville}</br>
Adresse Email : ${michael.email}</br>

<h1>Bonjour.Vous etes bien sur la page Login</h1>
</body>
</html>