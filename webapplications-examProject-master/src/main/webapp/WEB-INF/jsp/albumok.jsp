<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
<title>Albumok</title>
</head>
<body>
<h2><a href="albumForm">Új album felvitele</a></h2><br>
<table border=1 width=100%>
	<tr><th>Album ID</th><th>Cím</th><th>Eladott példányszám</th><th>Kiadás éve</th><th>Funkciók</th></tr>
<c:forEach var="album" items="${albumok}">
		<tr><td>${album.albumID}</td><td>${album.cim}</td><td>${album.eladottDb}</td><td>${album.kiadasDatum}</td>
		<td><a href="albumForm?id=${album.albumID}">Módosítás</a>, <a href="albumTorles?id=${album.albumID}">Törlés</a></tr>
</c:forEach>
</table>
<p>${hiba}</p>
<h4><a href="index">Vissza</a></h4><br>
</body>
</html>