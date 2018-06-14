<%-- 
    Document   : index
    Created on : 13-06-2018, 22:57:45
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    <link rel="stylesheet" type="text/css" href="css/estilo.css">
    
    <title>.:Inicio:.</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="#">NOMBRE PAGINA</a>
          </div>
          <ul class="nav navbar-nav">
            <li id="inicio"><a href="#">Inicio</a></li>
            <li id="juego"><a href="#">Juego</a></li>
            <li id="nosotros"><a href="#">Nosotros</a></li>
            <li id="contacto"><a href="#">Contacto</a></li>
          </ul>
        </div>
      </nav> 

</head>
<body>
    
        <div class="container"> 
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                  <!-- Wrapper for slides -->
                  <div class="carousel-inner" >
                    <div class="item active">
                      <img src="img/carousel/dallas.JPG" id="imagen">
                    </div>
              
                    <div class="item">
                      <img src="img/carousel/002.png" id="imagen">
                    </div>
                  
                    <div class="item">
                      <img src="img/carousel/ban.jpg" id="imagen">
                    </div>
                  </div>
                </div>
              </div>
    
        <div class="social">
                <ul>
                    <li><a href="http://www.facebook.com/" target="_blank" class="icon-facebook"><img src="img/iconos/facebook.png"></a></li>
                    <li><a href="http://www.twitter.com/" target="_blank" class="icon-twitter"><img src="img/iconos/twitter.png"></a></li>
                    <li><a href="https://www.instagram.com/?hl=es-la" target="_blank" class="icon-instagram"><img src="img/iconos/instagram.png"></a></li>
                </ul>
            </div>

</body>

<footer>
<div class="footer">
        <br>
        <p>Copyright © 2018 "detalles" All Rights Reserved.</p>
      </div>
    </footer>
</html>
