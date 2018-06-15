package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.insertarDatos;
import modelo.consultas;
import modelo.mensajes;
import modelo.actualizarDatos;
@WebServlet(name = "validacionDatos", urlPatterns = {"/validacionDatos"})
public class validacionDatos extends HttpServlet {

    insertarDatos insert = new insertarDatos();
    consultas c = new consultas();
    mensajes msg = new mensajes();
    actualizarDatos update= new actualizarDatos();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String valorBoton = request.getParameter("boton");

            String nombreUsuario = request.getParameter("nombreUsuario");
            String nombreUsuario1 = request.getParameter("nombreUsuario1");
            String nombreUsuario2 = request.getParameter("usuario2");
            String contraseña = request.getParameter("contrasena");
            String contraseñaActual = request.getParameter("contrasenaActual");
            String contraseñaNueva = request.getParameter("contrasenaNueva");
            String nombreCompleto = request.getParameter("nombreCompleto");
            String correo = request.getParameter("correo");
        
            
            String contraseña1 = request.getParameter("contrasena1");
            if (valorBoton.equals("Crear")) {
                out.println(insert.crearCuenta(nombreUsuario, contraseña, nombreCompleto, correo));
            } else if (valorBoton.equals("Ingresar")) {
                out.println(c.validacionLogin(nombreUsuario1, contraseña1));
                request.getSession().setAttribute("nombreUsuario1", nombreUsuario1);
                request.getSession().setAttribute("contrasena1", contraseña1);
            } else if (valorBoton.equals("salir")) {
                out.println(msg.SalirSesion());
            } else if (valorBoton.equals("opcionCambiarContraseña")) {
                response.sendRedirect("cambiarContrasena.jsp");
            } else if(valorBoton.equals("cambioContraseña")){
                out.println( update.actulizarContaseña(contraseñaNueva, nombreUsuario2, contraseñaActual));
            } else if(valorBoton.equals("detallesCuenta")){
                response.sendRedirect("detallesCuenta.jsp");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
