<%@page import="modelo.consultas"%>
<%
    String usuarioV = (String) session.getAttribute("nombreUsuario1");
    String contraseñaV = (String) session.getAttribute("contrasena1");
    consultas select = new consultas(usuarioV, contraseñaV);
%>
    <body id="fondo">
<div class="form-style-10">
        <h1>Detalles De La Cuenta</h1>
        <form>
            <div class="inner-wrap">
                <label>Nombre De Usuario<input type="text" placeholder="<%=select.getUsuario()%>" readonly="readonly"></label>
                <label>Nombre<input type="text" placeholder="<%=select.getNombre()%>" readonly="readonly"></label>
                <label>Contraseña<input type="text" placeholder="<%=select.getContraseña()%>" readonly="readonly"></label>
                <label>Correo Electronico<input type="text" placeholder="<%=select.getCorreo()%>" readonly="readonly"></label>
            </div>
        </form>
    </div>
</body>