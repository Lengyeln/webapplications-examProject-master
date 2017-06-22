<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
<title>Új bandatag</title>
</head>
<body>
<form:form action="/insertBandatag" method="post" modelAttribute="bandatag">
Bandatag ID: <input type="number" name="bandatagID" readonly value="${bandatag.bandatagID}"/>  (Automatikusan generált!)<br>
Név: <form:input type="text" path="nev"/><form:errors path='nev'/><br>
Neme: <form:input type="text" path="nem"/><form:errors path='nem'/><br>
Hangszer: <form:input type="text" path="hangszer"/><form:errors path='hangszer'/><br>
Születési dátum: <form:input type="date" path="szuletesiDatum"/><form:errors path='szuletesiDatum'/><br>
Születési hely: <form:input type="text" path="szuletesiHely"/><form:errors path='szuletesiHely'/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>