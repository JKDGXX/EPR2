package modelo;

import modelo.conexionBD;
import modelo.mensajes;

public class eliminarDatos {

    conexionBD coneccion = new conexionBD();
    mensajes msg = new mensajes();
    String retornoMensaje;

    public String eliminarCuenta(String usuario, String contraseña) {

        try{
        coneccion.Conexion();
        String SQL = "delete from usuario where nombre_usuario='" + usuario + "' and contraseña='" + contraseña + "'";
        coneccion.getSentencia().execute(SQL);
        retornoMensaje=msg.eliminarCuenta();
        coneccion.cerraConexion();
        }catch(Exception Error){
            this.retornoMensaje=msg.errorGeneral();
        }
        return this.retornoMensaje;
    }
}
