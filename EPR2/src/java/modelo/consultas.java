package modelo;

import modelo.conexionBD;
import modelo.mensajes;

public class consultas {

    conexionBD coneccion = new conexionBD();
    mensajes msg = new mensajes();
    String retornoMensaje;

    public String validacionLogin(String nombreUsuario, String contraseña) {

        try {
            coneccion.Conexion();
            String SQL = "select * from usuario where nombre_usuario='" + nombreUsuario + "' and contraseña='" + contraseña + "'";
            coneccion.resultado = coneccion.getSentencia().executeQuery(SQL);
            if (coneccion.getResultado().next()) {
                String nombre=coneccion.getResultado().getString("nombre");
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
}
