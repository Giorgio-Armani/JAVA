<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/Accueil.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<div id="div-accueil">
    <h1 class="paragraghe-red">
        Vous etes à l'accueil
    </h1>
</div>
<div id="div-menu">
    <a href="accueil"> Accueil</a>
<a href="utilisateur"> Utilisateur</a>
<a href="product"> Product</a>
<a href="login">Connexion</a>
<a href=ProduitsAlimentaire>Produits Alimentaires</a>
</div>

<div id="div-liens">
    <a href="Utilisateur.html"><img src="Ressources/Images/images.jpg" height="225" width="225"/></a>
<a href="Product.html"><img src="https://images.yourstory.com/2016/08/125-fall-in-love.png?auto=compress"> </a>
<a >Tester le lien avec hover</a>
</div>

<div>
    <label for="number">Number : </label><input type="number" id="number">
    <label for="date">Date : </label><input type="date" id="date">
    <label for="color">Color : </label><input type="color" id="color">
    <label for="time">Tme : </label><input type="time" id="time">
    <label for="checkbox">Checkbox : </label><input type="checkbox" id="checkbox">
    <label for="radio">Radio : </label><input type="radio" id="radio">
    <label for="gender">Gender: </label><input type="gender" id="gender">
    <label for="summit">Summit : </label><input type="summit" id="summit">
    <label for="tel">Tel : </label><input type="tel" id="tel">

</div>
<div>
    <input type="button" value="Click me" onclick="msg()">
    E-mail: <input type="email" name="emailaddress">  <input type="submit">

</div>
<script type="application/javascript" src="Ressources/JS/Accueil.js"></script>
</body>
</html>