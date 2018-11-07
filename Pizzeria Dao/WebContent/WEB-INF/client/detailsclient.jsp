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
  
ID: ${client.id }<br/>
NUM CLIENT: ${client.numClient }<br/>     
NOM: ${client.nom }<br/>	 
PRENOM: ${client.prenom }<br/>	 
NUM TELEPHONE: ${client.numTelephone }<br/> 
PORTABLE: ${client.portable }<br/> 
DATE NAISSANCE: ${client.dateNaissance }<br/>
EMAIL: ${client.email }<br/>	 
ADRESSE: ${client.adresse }<br/>	 
				

</body>
</html>