<body id="fondo">
    <br><br>
    <div class="form-style-10">
        <h1>Iniciar Sesion</h1>
        <form action="validacionDatos" method="post">
            <div class="inner-wrap">
                <label>Nombre De Usuario<input type="text" name="nombreUsuario" placeholder="Ingrese Usuario" required></label>
                <label>Contraseña<input type="password" name="contrasena" placeholder="Ingrese Contraseña" required></label>
                <label>Nombre Completo<input type="text" name="nombreCompleto" placeholder="Ingrese Nombre Completo" required></label>
                <label>Correo<input type="email" name="correo" placeholder="Ingrese Correo" required></label>

            </div>

            <div class="button-section" style="text-align: center;">
                <input type="submit" name="boton" value="Crear">
                <input type="reset" value="Limpiar">
            </div>
        </form>
    </div>
</body>
