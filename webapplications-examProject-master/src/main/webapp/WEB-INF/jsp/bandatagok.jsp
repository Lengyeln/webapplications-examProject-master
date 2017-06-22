<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
<title>Bandatagok</title>
</head>
<body>
<h2><a href="bandatagForm">Új tag felvitele</a></h2><br>
<table border=1 width=100%>
	<tr><th>Bandatag ID</th><th>Név</th><th>Neme</th><th>Hangszer</th><th>Születési dátum</th><th>Születési hely</th><th>Funkciók</th></tr>
<c:forEach var="tag" items="${bandatagok}">
		<tr><td>${tag.bandatagID}</td><td>${tag.nev}</td><td>${tag.nem}</td><td>${tag.hangszer}</td><td>${tag.szuletesiDatum}</td><td>${tag.szuletesiHely}</td>
		<td><a href="bandatagForm?id=${tag.bandatagID}">Módosítás</a>, <a href="bandatagTorles?id=${tag.bandatagID}">Törlés</a></tr>
</c:forEach>
</table>
<p>${hiba}</p>
<h4><a href="index">Vissza</a></h4><br>
</body>
</html>