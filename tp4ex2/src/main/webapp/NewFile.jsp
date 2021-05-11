<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>inscription</title>
</head>
<body>
<div class="container">
<h1> <center>bienvenue a votre session  </center> </h1>

<% if (request.getParameter("p").equals("")){ %>
<jsp:useBean id="per"  type="tp4ex2m.cl"  scope="session"/>    
<h1>Prenom<jsp:getProperty property="prenom" name="per"/></h1>
<h1>nom<jsp:getProperty property="nom" name="per"/></h1>
<%}else{ 
String p=request.getParameter("p");
String n=request.getParameter("n");
%>
<h1>prenom :   <%=p %> </h1>
<h1>nom    :   <%=n %> </h1>
<%} %>
  <a href="NewFile.html">rrrr</a>
</div>
</body>
</html>