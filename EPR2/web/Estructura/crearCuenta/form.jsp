<body id="fondo">
<form action="validacionDatos" method="post">

    <div>
        <label for="nombreDeUsuario">Nombre De Usuario</label>
        <input type="text" name="nombreUsuario" placeholder="Ingrese Usuario" required>
    </div>

    <div>
        <label for="contrasena">Contraseña</label>
        <input type="password" name="contrasena" placeholder="Ingrese Contraseña" required>
    </div>

    <div>
        <label for="nombreCompleto">Nombre Completo</label>
        <input type="text" name="nombreCompleto" placeholder="Ingrese Nombre Completo" required>
    </div>

    <div>
        <label for="correo">Correo</label>
        <input type="email" name="correo" placeholder="Ingrese Correo" required>
    </div>

    <div>
        <button type="submit" name="boton" value="creacionCuenta">Crear Cuenta</button>
        <button type="reset">Limpiar</button>
    </div>

</form>
</body>
