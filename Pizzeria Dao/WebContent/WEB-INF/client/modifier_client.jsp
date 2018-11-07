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
<form action="modifier_client" method="post">
    
    <label for="nom">nom:</label>
        <input type="text" name="nom" placeholder="nom" id="nom" value="${client.nom}"/><br>
    <label for="prenom">prenom:</label>
        <input type="text" name="prenom" placeholder="prenom" id="prenom" value="${client.prenom}"/><br>
    <label for="email">email:</label>
        <input type="text" name="email" placeholder="email" id="email" value="${client.email}"/><br>
    <label for="date_naissance">date_naissance:</label>
        <input type="text" name="date_naissance" placeholder="date_naissance" id="date_naissance" value="${client.dateNaissance}"/><br>
    <label for="num_client">num_client:</label>
        <input type="text" name="num_client" placeholder="num_client" id="num_client" value="${client.numClient}"/><br>
    <label for="tel_fixe">tel_fixe:</label>
        <input type="text" name="tel_fixe" placeholder="tel_fixe" id="tel_fixe" value="${client.numTelephone}"/><br>
    <label for="tel_portable">tel_portable:</label>  
         <input type="text" name="tel_portable" placeholder ="tel_portable" id="tel_portable" value="${client.portable}"/><br>  
    <label for="adresse">adresse:</label>
        <input type="text" name="adresse" placeholder="adresse" id="adresse" value="${client.adresse}"/><br>
    <label for="id">id:</label>    
        <input type="text" name="id" placeholder="id" id="id" value="${client.id}" hidden="hidden"/>
        <input type="submit" value="valider"/>
        </form>


</body>
</html>