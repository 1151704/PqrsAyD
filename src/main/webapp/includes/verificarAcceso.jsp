<%@page import="edu.ufps.pqrsayd.dto.TipoMensaje"%>
<%@page import="edu.ufps.pqrsayd.dto.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" scope="session" class="edu.ufps.pqrsayd.service.postgres.Service"/>
<%
    if (session.getAttribute("usuarioActual") == null) {
        session.setAttribute("mensaje", new Mensaje("Sin sesión", "Las credenciales de acceso no se proveyeron o la sesión a caducado", TipoMensaje.WARNING));
        out.print("<script>window.location.href = '" + request.getContextPath() + "/index.jsp';</script>");
    }
%>