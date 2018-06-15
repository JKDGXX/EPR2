package modelo;

import modelo.conexionBD;
import modelo.mensajes;

public class actualizarDatos {

    conexionBD coneccion = new conexionBD();
    mensajes msg = new mensajes();

    String retornoMensaje;

    public String actulizarContaseña(String passNueva, String Usuario, String passActual) {

        try {
            coneccion.Conexion();

            String SQL1 = "select * from usuario where nombre_usuario='" + Usuario + "' and contraseña='" + passActual + "'";
            coneccion.resultado = coneccion.sentencia.executeQuery(SQL1);
            if (coneccion.getResultado().next()) {

                String SQL = "update usuario set contraseña='" + passNueva + "'where nombre_usuario='" + Usuario + "' and contraseña='" + passActual + "'";
                coneccion.sentencia.executeUpdate(SQL);
                this.retornoMensaje = msg.contraseñaActualizada();

            } else {

                this.retornoMensaje = msg.errorEnDatosCambioContraseña();

            }
            coneccion.cerraConexion();
        } catch (Exception Error) {

            this.retornoMensaje = msg.errorGeneral();

        }
        return this.retornoMensaje;
    }

}
