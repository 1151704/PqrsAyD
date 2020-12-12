<%@page import="java.util.ArrayList"%>
<%@page import="edu.ufps.pqrsayd.dto.MotivoSolicitudDto"%>
<%@page import="java.util.List"%>
<%@page import="edu.ufps.pqrsayd.util.Utilidades"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" scope="session" class="edu.ufps.pqrsayd.service.postgres.Service" />
<%
    Integer tipoSolicitud = Utilidades.validateInputNumber(request.getParameter("tipo"));
    List<MotivoSolicitudDto> motivos = new ArrayList();
    if (tipoSolicitud != null) {
        motivos = controlador.serviceMotivoSolicitud().listarPorTipoSolicitud(tipoSolicitud);
    }
%>
<option value="" disabled>Seleccione ..</option>
<% for (MotivoSolicitudDto motivo : motivos) {%>
<option value="<%=motivo.getId()%>"><%=motivo.getDescripcion()%></option>
<% }%>