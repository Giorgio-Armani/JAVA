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
<form action="ajout_client" method="post">
    
    <label for="nom">nom:</label>
        <input type="text" name="nom" placeholder="nom" id="nom"/><br>
    <label for="prenom">prenom:</label>
        <input type="text" name="prenom" placeholder="prenom" id="prenom"/><br>
    <label for="email">email:</label>
        <input type="text" name="email" placeholder="email" id="email"/><br>
    <label for="date_naissance">date_naissance:</label>
        <input type="text" name="date_naissance" placeholder="date_naissance" id=date_naissance/><br>
    <label for="num_client">num_client:</label>
        <input type="text" name="num_client" placeholder="num_client" id="num_client"/><br>
    <label for="tel_fixe">tel_fixe:</label>
        <input type="text" name="tel_fixe" placeholder="tel_fixe" id="tel_fixe"/><br>
    <label for="tel_portable">tel_portable:</label>  
         <input type="text" name="tel_portable" placeholder ="tel_portable" id="tel_portable"/><br>  
    <label for="adresse">adresse:</label>
        <input type="text" name="adresse" placeholder="adresse" id="adresse"/><br>
        <input type="submit" value="valider"/>
        </form>

</body>
</html>