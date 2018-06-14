<form action="validacionDatos" method="post">
    
    <div>
        <label for="nombreUsuario">Nombre Usuario</label>
        <input type="text" name="nombreUsuario1" placeholder="Ingrese Usuario" required>
    </div>
    
    <div>
        <label for="contraseña">Contraseña</label>
        <input type="password" name="contrasena1" placeholder="Ingrese Contraseña" required>
    </div>
    
    <div>
        <button type="submit" name="boton" value="ingresoCuenta">Entrar</button>
        <button type="reset">Limpiar</button>
    </div>
    
</form>
<body background="img/contacto.jpg">
<div class="form-style-10">
        <h1>Iniciar Sesion</h1>
        <form action="ControladorContacto" method="post">
            <div class="inner-wrap">
                <label>Nombre <input type="text" name="nom" required/></label>
                <label>Apellido <input type="text" name="ape" required/></label>
                <label>Email <input type="email" name="email" required/></label>
                <label>Mensaje <textarea name="mensaje" required></textarea></label>
            </div>

            <div class="button-section" style="text-align: center;">
                <input type="submit" name="enviar" value="Enviar">
            </div>
        </form>
    </div>
</body>
