<%@page import="modelo.consultas"%>
<%
    String usuarioV = (String) session.getAttribute("nombreUsuario1");
    String contrase�aV = (String) session.getAttribute("contrasena1");
    consultas select = new consultas(usuarioV, contrase�aV);
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
        <label for="Nombre">Contrase�a</label>
        <input type="text" placeholder="<%=select.getContrase�a()%>" readonly="readonly">
    </div>
    
    <div>
        <label for="Nombre">Correo Electronico</label>
        <input type="text" placeholder="<%=select.getCorreo()%>" readonly="readonly">
    </div>


</form>