<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="modifier_pizza" method="post">
    <label for="libelle">Libelle:</label>
        <input type="text" name="libelle" placeholder="Libelle" id="libelle" value="${pizza.libelle}"/><br>
    <label for="reference">Reference:</label>
        <input type="text" name="reference" placeholder="Reference" id="referenec" value="${pizza.reference}"/><br>
    <label for="prix">Prix:</label>
        <input type="text" name="prix" placeholder="Prix" id="prix" value="${pizza.prix }"/><br>
    <label for="id">Id:</label>
         <input type="text" name="id" placeholder="Id" id="id" value="${pizza.id }"/></br>    
    <label for="url">Url:</label>
        <input type="text" name="url" placeholder="url" id="url" value="${pizza.urlImage }"/><br>
        <input type="submit" value="valider"/>
        </form>

</body>
</html>