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
  

}
