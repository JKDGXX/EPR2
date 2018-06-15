package modelo;

import modelo.conexionBD;
import modelo.mensajes;

public class insertarDatos {

    conexionBD coneccion = new conexionBD();
    mensajes msg = new mensajes();
    String retornoMensaje;

    public String crearCuenta(String nombreUsuario, String contraseña, String nombre, String correo) {
        try {
            coneccion.Conexion();
            String SQL = "INSERT INTO usuario (nombre_usuario,contraseña,nombre,correo) VALUES ('" + nombreUsuario + "','" + contraseña + "','" + nombre + "','" + correo + "')";
        coneccion.getSentencia().execute(SQL);
            retornoMensaje = msg.ingresoDeDatosExitoso();
            coneccion.cerraConexion();
        } catch (Exception Error) {
            retornoMensaje = msg.errorGeneral();
        }

        return retornoMensaje;
    }

    public String envioMensaje(String nombre, String correo, String comentario) {

        try {
            coneccion.Conexion();
            String SQL = "INSERT INTO comentarios (nombre,correo,comentario) VALUES ('" + nombre + "','" + correo + "','" + comentario + "')";
            coneccion.getSentencia().execute(SQL);
            this.retornoMensaje = msg.mensajeEnviado();
            coneccion.cerraConexion();
        } catch (Exception Error) {
            this.retornoMensaje = msg.errorGeneral();
        }

        return this.retornoMensaje;
    }

}
