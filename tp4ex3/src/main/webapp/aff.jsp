<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title> mvc excercie 3</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
    crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
    crossorigin="anonymous"></script>
  <link rel="stylesheet" href="style.css">
</head>



<body>
> 
  <div class="container">
    <div class="row">
      <div class="col-md-2"></div>
      <div class="col-md-8">
        <div class="row" style="margin-top:120px;box-shadow :-1px 1px 50px 10px black;border-radius: 20px;">
          <div class="col-md-6">
          
            <jsp:useBean id="client"   class="beanm.client"  scope="session"/>
            
             <h2> Nom</h2>  
              <jsp:getProperty property="nom" name="client"/>
              
                <h2>Prenom</h2>
              <jsp:getProperty property="prenom" name="client"/>
              <h2> Adresse</h2>
              <jsp:getProperty property="adresse" name="client"/>
              
              <h2> telephone</h2>
              <jsp:getProperty property="telephone" name="client"/>
                  <h2>Adresse_email</h2>
              <jsp:getProperty property="adresse_email" name="client"/>
           
           <br>
             <a href="index.html">reutour</a>
          </div>
          <div class="col-md-6"></div>
        </div>
      </div>
      <div class="col-md-2"></div>


    </div>
  </div>

  <script src="" async defer></script>
</body>

</html>