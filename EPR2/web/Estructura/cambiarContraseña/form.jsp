<%@page import="modelo.actualizarDatos"%>
<% String usuario = (String) session.getAttribute("nombreUsuario1");%>
<body id="fondo">
    <br><br>
    <div class="form-style-10">
        <h1>Cambio De Contraseņa</h1>
        <form action="validacionDatos" method="post">
            <div class="inner-wrap">
                <input id="inputUsuario" type="hidden" value="<%=usuario%>" name="usuario2">
                <label>Contraseņa Actual<input type="password" name="contrasenaActual" required></label>
                <label>Contraseņa Nueva<input type="password" name="contrasenaNueva" required></label>
            </div>

            <div class="button-section" style="text-align: center;">
                <input type="submit" name="boton" value="Cambiar Contraseņa">
            </div>
        </form>
    </div>
</body>