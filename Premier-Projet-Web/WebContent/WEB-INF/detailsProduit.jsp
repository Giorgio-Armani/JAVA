<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Produits</title>
</head>
<body>
<a href="http://localhost:8080/Premier-Projet-Web/ProduitsAlimentaire">Retour</a><br/>
<div>
	<img src="${url}">

	<p class="Nom">nom:${nom }</p>
	<p class="Prix">prix:${prix }€</p>


</div> 

</body>
</html>