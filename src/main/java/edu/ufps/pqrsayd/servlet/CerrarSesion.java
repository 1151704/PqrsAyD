package edu.ufps.pqrsayd.servlet;

import edu.ufps.pqrsayd.dto.Mensaje;
import edu.ufps.pqrsayd.dto.TipoMensaje;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CerrarSesion extends HttpServlet {

    private HttpSession session;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        session = req.getSession();
        session.invalidate();        
        session = req.getSession();        
        resp.sendRedirect(req.getContextPath() + "index.jsp");

    }

}
