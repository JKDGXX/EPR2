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
  

}
