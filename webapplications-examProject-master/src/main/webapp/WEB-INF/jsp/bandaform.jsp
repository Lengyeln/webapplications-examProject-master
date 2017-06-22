<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
<title>Új banda</title>
</head>
<body>
<form:form action="/insertBanda" method="post" modelAttribute="banda">
Banda ID: <input type="number" name="bandaID" readonly value="${banda.bandaID}"/>  (Automatikusan generált!)<br>
Név: <form:input type="text" path="nev"/><form:errors path='nev'/><br>
Neme: <form:input type="text" path="mufaj"/><form:errors path='mufaj'/><br>
Származási hely: <form:input type="text" path="szarmazas"/><form:errors path='szarmazas'/><br>
Albumok: <form:checkboxes items="${albumok}" path="albumok" itemLabel="cim" itemValue="albumID" delimiter="    "/><br>
Bandatagok: <form:checkboxes items="${bandatagok}" path="tagok" itemLabel="nev" itemValue="bandatagID" delimiter="    "/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>