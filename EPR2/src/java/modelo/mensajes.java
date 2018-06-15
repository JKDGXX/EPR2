package modelo;

public class mensajes {

    String msg;

    public String errorGeneral() {

        return msg = "<script>"
                + "alert('ERROR EN LA BASE DE DATOS !!!');"
                + "location.href='index.jsp';"
                + " </script>";
    }

    public String ingresoDeDatosExitoso() {

        return msg = "<script> "
                + "alert('CUENTA CREADA CON EXITO !!!');"
                + "location.href='crearCuenta.jsp';"
                + " </script>";
    }
    public String ingresoCorrectoLogin(String nombre){
        
        return msg="<script>"
                + "alert('Datos Correctos, Bienvenido "+nombre+"');"
                + "location.href='juego.jsp';"
                + "</script>";
    }
    public String ingresoIncorrectoLogin(){
        
        return msg="<script>"
                + "alert('Datos Erroneos !!!');"
                + "location.href='login.jsp';"
                + "</script>";
    }
    public String SalirSesion(){
        
        return msg="<script>"
                + "var v;"
                + "v=confirm('¿Desea Salir');"
                + "if(v){"
                + "location.href='login.jsp';"
                + "}else{"
                + "location.href='juego.jsp';"
                + "}"
                + "</script>";
    }
    public String contraseñaActualizada(){
        
        return msg="<script>"
                + "alert('Contraseña Actualizada Con Exito !!!');"
                + "location.href='login.jsp';"
                + "</script>";
    }
    public String noExisteRegistro(){
        
        return msg="<script>"
                + "alert('CONTRASEÑA ERRONEA !!!');"
                + "location.href='cambiarContasena.jsp';"
                + "</script>";
    }
    public String mensajeEnviado(){
        
        return msg="<script>"
                + "alert('MENSAJE ENVIADO CON EXITO !!!');"
                + "location.href='contacto.jsp';"
                + "</script>";
    }

}
