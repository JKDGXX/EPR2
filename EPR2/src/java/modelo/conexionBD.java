package modelo;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class conexionBD {

    Connection coneccion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    String nombreBaseDatos = "webjuego";
    String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDatos;
    private String usuario = "root";
    private String contraseña = "";
    String mensaje;

    public void Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            coneccion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = coneccion.createStatement();
            mensaje = "CONEXION REALIZADA CON EXITO A LA BASE DE DATOS " + this.nombreBaseDatos + " !!!";
        } catch (Exception Error) {
            mensaje = "ERROR AL REALIZAR CONEXION CON LA BASE DE DATOS !!! \n" + Error;
        }

    }

    public void cerraConexion() {
        try {
            this.coneccion.close();
            this.sentencia.close();
        } catch (Exception Error) {
            mensaje = "ERROR AL REALIZAR CONEXION CON LA BASE DE DATOS !!! \n" + Error;
        }
    }
    public Statement getSentencia(){
        
        return this.sentencia;
    }
    public ResultSet getResultado(){
        
        return this.resultado;  
    }
}
