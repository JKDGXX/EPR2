<%@page import="modelo.consultas"%>
<%
    String usuarioV = (String) session.getAttribute("nombreUsuario1");
    String contraseñaV = (String) session.getAttribute("contrasena1");
    consultas select = new consultas(usuarioV, contraseñaV);
%>

<form>
    <div>
        <label for="nombreUsuario">Nombre De Usuario</label>
        <input type="text" placeholder="<%=select.getUsuario()%>" readonly="readonly">
    </div>

    <div>
        <label for="Nombre">Nombre Completo</label>
        <input type="text" placeholder="<%=select.getNombre()%>" readonly="readonly">
    </div>
    <div>
        <label for="Nombre">Contraseña</label>
        <input type="text" placeholder="<%=select.getContraseña()%>" readonly="readonly">
    </div>
    
    <div>
        <label for="Nombre">Correo Electronico</label>
        <input type="text" placeholder="<%=select.getCorreo()%>" readonly="readonly">
    </div>


</form>