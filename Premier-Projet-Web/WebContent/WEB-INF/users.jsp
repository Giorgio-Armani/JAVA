<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/produitsAlimentaire.css">
<meta charset="ISO-8859-1">
<title>User Personne</title>
</head>
<body>

<div id="div-alimentaires">
    <fieldset>
    <c:forEach items="${p}" var="personne">
        <div class="produit">

           <a href="UsersDetailsServlet?url=${personne.url}&nom=${personne.nom}&prenom=${personne.prenom}&dateNaissance=${personne.dateNaissance}&telephone=${personne.telephone}&numeroEtRue=${personne.numeroEtRue} &ville=${personne.ville}&email=${personne.email}"><img src="${personne.url }" alt="${personne.nom }" title="${personne.nom }"></a>
            <p class="abri">${personne.nom } ${personne.prenom }</p>

        </div>
      </c:forEach>
    </fieldset>
</div>

</body>
</html>