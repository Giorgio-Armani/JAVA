<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/css/utilisateur.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value ="bonjour"/>

<c:out value ="${helloJstl}"/>


<p style="color: red; background: blue">
Bonjour
</p>
<p>
<ol>Infos personnel</ol>
<ol>
    <li>Dubois</li>
    <li>Jean</li>
    <li>25/10/1970</li>

</ol>
</p>
<a href="accueil">Accueil </a></br>
<p>
<table style="width: 500px">
    <tr>
        <th>Nom</th>
        <th>Âge</th>
        <th>Pays</th>
    </tr>
    <tr>
        <td>Carmen</td>
        <td>33 ans</td>
        <td>Espagne</td>
    </tr>
    <tr>
        <td>Michelle</td>
        <td>26 ans</td>
        <td>États-Unis</td>
    </tr>
    <tr>
        <td>Bob</td>
        <td>45 ans</td>
        <td>Marseille</td>
    </tr>
</table>
</p>

<script type="application/javascript" src="Ressources/JS/utilisateur.js"></script>
</body>
</html>