<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Premier Projet JEE</title>
</head>
<body>
	<h1>Hello JEE</h1>
	<%

System.out.println("Hello JEE");

%>
	<%!
int nombre1 = 10;
int nombre2 = 30;
int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

%>
	<%
System.out.println("max :"+max(nombre1, nombre2));
%>
	<%= "max :"+max(nombre1,nombre2) %>

	<%
   for(int i = 0; i < 10; i++){
%>
	<h1>titre en html</h1>
	<h2>titre h2</h2>


	<% } %>

	<table>
		<%
int nombre = 1;
for (int i = 0; i < 3; i++) {
%>
		<tr>
			<%
for(int j = 0 ; j < 3 ; j++){
%>
			<td><%= nombre %>
			<td />
			<% nombre++;} %>
		
		<tr />
		<%} %>
</body>
</html>