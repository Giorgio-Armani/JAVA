<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/pizza.css">
<meta charset="ISO-8859-1">
<title>Pizzeria</title>
<style>
td,tr,th,table{
border: green 5px solid;
border-collapse: collapse;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>LIBELLE</th>
			<th>REFERENCE</th>
			<th>PRIX</th>
			<th>URL</th>

		</tr>
		<c:forEach items="${listepizza}" var="pizza">
			<tr>
				<td>${pizza.id }</td>
				<td>${pizza.libelle }</td>
				<td>${pizza.reference }</td>
				<td>${pizza.prix }</td>
				<td>${pizza.urlImage }</td>
				<td><a href="modifier_pizza?id=${pizza.id }">modifier</a></td>
				<td><a href="supprimer_pizza?id=${pizza.id }">supprimer</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="ajout_pizza">ajouter une pizza</a>
	
	 <div id="div-alimentaires">
    <fieldset>
    <c:forEach items="${listepizza}" var="pizza">
        <div class="produit">
            <p class="prix">${pizza.prix}</p>
          <img src="Ressources/Image/${pizza.urlImage }" alt="${pizza.libelle }" title="${pizza.libelle }">
            <p class="abri">${pizza.libelle }</p>

        </div>
      </c:forEach>
    </fieldset>
</div> 
	

</body>
</html>