 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/layout.css"/>
<title>Új album</title>
</head>
<body>
<form:form action="/insertAlbum" method="post" modelAttribute="album">
Album ID: <input type="number" name="albumID" readonly value="${album.albumID}"/>  (Automatikusan generált!)<br>
Cim: <form:input type="text" path="cim"/><form:errors path='cim'/><br>
Eladott darabszám: <form:input type="number" path="eladottDb"/><form:errors path='eladottDb'/><br>
Kiadás éve: <form:input type="number" path="kiadasDatum"/><form:errors path='kiadasDatum'/><br>
<input type="submit" value="OK"/>
</form:form>
</body>
</html>