<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ajout_pizza" method="post">
    <label for="libelle">Libelle:</label>
        <input type="text" name="libelle" placeholder="Libelle" id="libelle"/><br>
    <label for="reference">Reference:</label>
        <input type="text" name="reference" placeholder="Reference" id="referenec"/><br>
    <label for="prix">Prix:</label>
        <input type="text" name="prix" placeholder="Prix" id="prix"/><br>
    <label for="id">Id:</label>  
         <input type="text" name="id" placeholder ="Id" id="id"/><br>  
    <label for="url">Url:</label>
        <input type="text" name="url" placeholder="url" id="url"/><br>
        <input type="submit" value="valider"/>
        </form>
</body />
</html>