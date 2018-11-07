<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produits MVC</title>
</head>
<link rel="stylesheet" href="Ressources/CSS/produitsAlimentaire.css">
<body>


<p>
<h1>Produits MVC</h1>
<h2>
    <a href="accueil">Retour à l'Accueil </a></h2>
<p>
<!-- <table>
    <tr>
        <th>Nom</th>
        <th>marque</th>
        <th>Prix</th>
    </tr>
    <tr>
        <td>fruit</td>
        <td>Abricot</td>
        <td>10€</td>
    <tr>
        <td>Graines</td>
        <td>Lentille</td>
        <td>16€</td>
    <tr/>
    <tr>
        <td>Legumes</td>
        <td>Avocats</td>
        <td>15€</td>
    </tr>
    <tr>
        <td>Sucreries</td>
        <td>Bonbon</td>
        <td>10€</td>
    </tr>
    <tr>
        <td>Bactérie</td>
        <td>Levure</td>
        <td>8€</td>
    </tr>
    <tr>
        <td>Produit Laitier</td>
        <td>Fromage</td>
        <td>12€</td>
    </tr>
    <tr>
        <td>Viande</td>
        <td>Agneau</td>
        <td>100€</td>
    </tr>
</table> -->
</p>

<div id="div-alimentaires">
    <fieldset>
    <c:forEach items="${tabProduitAlimentaires}" var="produit">
        <div class="produit">
            <p class="prix">${produit.prix}</p>
           <a href="detail_produit?url=${produit.url}&nom=${produit.nom}&prix=${produit.prix}"><img src="${produit.url }" alt="${produit.nom }" title="${produit.nom }"></a>
            <p class="abri">${produit.nom }</p>

        </div>
      </c:forEach>
    </fieldset>
</div>
<script type="application/javascript" src="Ressources/JS/produitsAlimentaire.js"></script>

</body>
</html>