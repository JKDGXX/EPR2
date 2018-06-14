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

@WebServlet(name = "validacionDatos", urlPatterns = {"/validacionDatos"})
public class validacionDatos extends HttpServlet {

    insertarDatos insert = new insertarDatos();
    consultas validacionLogin = new consultas();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String valorBoton = request.getParameter("boton");

            String nombreUsuario = request.getParameter("nombreUsuario");
            String contraseña = request.getParameter("contrasena");
            String nombreCompleto = request.getParameter("nombreCompleto");
            String correo = request.getParameter("correo");

            String nombreUsuario1 = request.getParameter("nombreUsuario1");
            String contraseña1 = request.getParameter("contrasena1");
            if (valorBoton.equals("creacionCuenta")) {
                out.println(insert.crearCuenta(nombreUsuario, contraseña, nombreCompleto, correo));
            } else if (valorBoton.equals("Ingresar")) {
                out.println(validacionLogin.validacionLogin(nombreUsuario1, contraseña1));
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
