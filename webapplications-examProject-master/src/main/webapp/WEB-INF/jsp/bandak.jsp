<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
<title>Bandák</title>
</head>
<body>
<h2><a href="bandaForm">Új banda felvitele</a></h2><br>
<table border=1 width=100%>
	<tr><th>Banda ID</th><th>Név</th><th>Műfaj</th><th>Származási hely</th><th>Bandatagok</th><th>Banda albumai</th><th>Funkciók</th></tr>
<c:forEach var="banda" items="${bandak}">
		<tr><td>${banda.bandaID}</td><td>${banda.nev}</td><td>${banda.mufaj}</td><td>${banda.szarmazas}</td><td>${banda.tagok}</td><td>${banda.albumok}</td>
		<td><a href="bandaForm?id=${banda.bandaID}">Módosítás</a>, <a href="bandaTorles?id=${banda.bandaID}">Törlés</a></tr>
</c:forEach>
</table>
<h4><a href="index">Vissza</a></h4><br>
</body>
</html>