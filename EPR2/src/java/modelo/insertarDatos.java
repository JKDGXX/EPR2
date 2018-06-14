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
            coneccion.getSentencia().executeUpdate(SQL);
            retornoMensaje = msg.ingresoDeDatosExitoso();
            coneccion.cerraConexion();
        } catch (Exception Error) {
            retornoMensaje = msg.errorGeneral();
        }

        return retornoMensaje;
    }

}
