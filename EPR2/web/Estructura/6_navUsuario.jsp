<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#" >RDiamond</a>
        </div>
        <ul class="nav navbar-nav">
            <li id="inicio"><a href="index.jsp">Inicio</a></li>
        </ul>  


        <form action="validacionDatos" method="post">
            <div class="btn-group" id="opcionesAdministrador">

                <button type="button" class="btn btn-default dropdown-toggle"
                        data-toggle="dropdown"><img src="img/iconos/opciones.png" width="20" height="20"><span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" id="menu">
                    <li><button id="buttonOpciones" name="boton" value="opcionCambiarContraseña">Cambiar Contraseña</button></li>
                    <li><button id="buttonOpciones" name="boton" value="detallesCuenta">Detalles De Cuenta</button></li>
                    <li><button id="buttonOpciones" name="boton" value="salir">Salir</button></li>
                </ul>

            </div>
        </form>
    </div>
</nav> 
