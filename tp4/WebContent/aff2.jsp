<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>inscription</title>
</head>
<body>
<h1> <center>bienvenue a votre session  </center> </h1>
<% if (request.getParameter("p").equals("")){ %>
<jsp:useBean id="per"   type="modele.beanndeux"    scope="session"/>    
<h1>Prenom<jsp:getProperty property="prenom" name="per"/></h1>
<h1>nom<jsp:getProperty property="nom" name="per"/></h1>
<%}else{ 
String p=request.getParameter("p");
String n=request.getParameter("n");
%>
<h1>prenom <%=p %> </h1>
<h1>prenom <%=n %> </h1>
<%} %>

</body>
</html>