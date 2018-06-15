package modelo;

import modelo.conexionBD;
import modelo.mensajes;

public class consultas {

    conexionBD coneccion = new conexionBD();
    mensajes msg = new mensajes();
    String retornoMensaje;

    String usuario;
    String nombre;
    String correo;
    String contraseña;
    public consultas(String usuario, String contraseña) {

        verDetallesDeCuenta(usuario, contraseña);

    }
    public consultas(){
        
    }

    public String validacionLogin(String nombreUsuario, String contraseña) {

        try {
            coneccion.Conexion();
            String SQL = "select * from usuario where nombre_usuario='" + nombreUsuario + "' and contraseña='" + contraseña + "'";
            coneccion.resultado = coneccion.getSentencia().executeQuery(SQL);
            if (coneccion.getResultado().next()) {
                String nombre = coneccion.getResultado().getString("nombre");
                this.retornoMensaje = msg.ingresoCorrectoLogin(nombre);
            } else {
                this.retornoMensaje = msg.ingresoIncorrectoLogin();
            }
            coneccion.cerraConexion();
        } catch (Exception Error) {
            this.retornoMensaje = msg.errorGeneral();
        }
        return this.retornoMensaje;
    }

    public void verDetallesDeCuenta(String usuario, String contraseña) {
        String mensaje = null;
        try {

            coneccion.Conexion();
            String SQL = "select * from usuario  where nombre_usuario='" + usuario + "' and contraseña='" + contraseña + "'";
            coneccion.resultado = coneccion.getSentencia().executeQuery(SQL);
            while (this.coneccion.getResultado().next()) {

                this.usuario = this.coneccion.getResultado().getString("nombre_usuario");
                this.nombre = this.coneccion.getResultado().getString("nombre");
                this.correo = this.coneccion.getResultado().getString("correo");
                this.contraseña = this.coneccion.getResultado().getString("contraseña");

            }
            coneccion.cerraConexion();

        } catch (Exception Error) {

            String e = Error.getMessage();
            mensaje = "<script>alert('Error');"
                    + "location.href='login.jsp';"
                    + "</script>";

        }
    }

    public String getUsuario() {

        return this.usuario;
    }

    public String getNombre() {

        return this.nombre;
    }

    public String getCorreo() {

        return this.correo;
    }
    public String getContraseña(){
        
        return this.contraseña;
    }
}
