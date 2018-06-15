<%@page import="modelo.actualizarDatos"%>

<% String usuario = (String) session.getAttribute("nombreUsuario1");%>

<form action="validacionDatos" method="post" id="formularioCambiarContraseña">
    <h1 id="tituloFormulario">Cambio De Contraseña</h1>

    <div>
        <input id="inputUsuario" type="hidden" value="<%=usuario%>" name="usuario2">
    </div>
    <div>
        <label for="contraseñaActual"><strong>Contraseña Actual</strong></label>
        <input type="password" name="contrasenaActual" required>
    </div>
    <div id="divCampos">
        <label for="contraseñaNueva"><strong>Contraseña Nueva</strong></label>
        <input type="password" name="contrasenaNueva" required>
    </div>
    <div id="divButton">
        <button type="submit" name="boton" value="cambioContraseña">Enviar</button>
    </div>
</form>