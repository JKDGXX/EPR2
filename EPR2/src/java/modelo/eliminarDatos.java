package modelo;

import modelo.conexionBD;
import modelo.mensajes;

public class eliminarDatos {

    conexionBD coneccion = new conexionBD();
    mensajes msg = new mensajes();
    String retornoMensaje;

    public String eliminarCuenta(String usuario, String contraseña) {

        try {
            coneccion.Conexion();
            String SQL1 = "select * from usuario where nombre_usuario='" + usuario + "' and contraseña='" + contraseña + "'";
            coneccion.resultado = coneccion.sentencia.executeQuery(SQL1);

            if (coneccion.getResultado().next()) {

                String SQL = "delete from usuario where nombre_usuario='" + usuario + "' and contraseña='" + contraseña + "'";
                coneccion.getSentencia().execute(SQL);
                retornoMensaje = msg.eliminarCuenta();

            } else {
                retornoMensaje = msg.errorEnDatos();
            }

            coneccion.cerraConexion();
        } catch (Exception Error) {
            this.retornoMensaje = msg.errorGeneral();
        }
        return this.retornoMensaje;
    }
}
