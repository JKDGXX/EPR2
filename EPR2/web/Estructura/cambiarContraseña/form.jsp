<%@page import="modelo.actualizarDatos"%>

<% String usuario = (String) session.getAttribute("nombreUsuario1");%>

<form action="validacionDatos" method="post" id="formularioCambiarContrase�a">
    <h1 id="tituloFormulario">Cambio De Contrase�a</h1>

    <div>
        <input id="inputUsuario" type="hidden" value="<%=usuario%>" name="usuario2">
    </div>
    <div>
        <label for="contrase�aActual"><strong>Contrase�a Actual</strong></label>
        <input type="password" name="contrasenaActual" required>
    </div>
    <div id="divCampos">
        <label for="contrase�aNueva"><strong>Contrase�a Nueva</strong></label>
        <input type="password" name="contrasenaNueva" required>
    </div>
    <div id="divButton">
        <button type="submit" name="boton" value="cambioContrase�a">Enviar</button>
    </div>
</form>