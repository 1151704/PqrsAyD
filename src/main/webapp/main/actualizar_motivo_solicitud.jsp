<%@page import="edu.ufps.pqrsayd.dto.TipoSolicitudDto"%>
<%@page import="edu.ufps.pqrsayd.dto.TipoIdentificacionDto"%>
<%@page import="java.util.List"%>
<%@page import="edu.ufps.pqrsayd.dto.FuncionarioDto"%>
<%@page import="edu.ufps.pqrsayd.dto.MotivoSolicitudDto"%>
<%@page import="edu.ufps.pqrsayd.dto.UsuarioDto"%>
<%@page import="edu.ufps.pqrsayd.dto.SolicitudDto"%>
<%@page import="edu.ufps.pqrsayd.util.Utilidades"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" scope="session" class="edu.ufps.pqrsayd.service.postgres.Service" />
<jsp:include page="../includes/verificarAcceso.jsp" flush="true"/>
<%
    Integer id_tipo = Utilidades.validateInputNumber(request.getParameter("id"));

    if (id_tipo == null) {
        out.print("<script>window.location.href = '" + request.getContextPath() + "/main/tipos_solicitudes.jsp';</script>");
    }

    MotivoSolicitudDto tipoSolicitud = controlador.serviceMotivoSolicitud().buscarPorId(id_tipo);

    if (tipoSolicitud == null) {
        out.print("<script>window.location.href = '" + request.getContextPath() + "/main/tipos_solicitudes.jsp';</script>");
    } else {

%>
<!doctype html>
<html lang="es">
    <head>
        <jsp:include page="../includes/head.jsp" flush="true" />
        <title>Motivo Solicitud - PQRS</title>
    </head>
    <body>
        <!-- Page Wrapper -->
        <div id="wrapper">
            <jsp:include page="../includes/menu.jsp" flush="true" />

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="../includes/topbar.jsp" flush="true" />    

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <div class="card shadow mb-4">
                            <div class="card-header py-3">

                                <h6 class="m-0 font-weight-bold text-primary"><a class="btn btn-sm btn-outline-dark mr-1" href="motivos_solicitudes.jsp?id=<%=tipoSolicitud.getId()%>"><i class="fas fa-arrow-circle-left"></i> Volver</a>Actualizar Motivo Solicitud</h6>
                            </div>
                            <div class="card-body">
                                <form action="<%=request.getContextPath()%>/actualizar-motivo-solicitud" method="post">
                                    <input name="id" value="<%=tipoSolicitud.getId()%>" type="hidden" >
                                    <div class="form-group">
                                        <div class="form-row">
                                            <div class="col-lg-2 d-flex align-items-center">
                                                <div class="form-check">
                                                    <input type="checkbox" <%=tipoSolicitud.getHabilitado() ? "checked" : ""%> class="form-check-input" id="habilitado" name="habilitado" >
                                                    <label class="form-check-label" for="habilitado">Habilitado</label>
                                                </div>
                                            </div>
                                            <div class="col-lg-7">
                                                <div class="form-group">
                                                    <label>Descripción *</label>
                                                    <input type="text" value="<%=tipoSolicitud.getDescripcion()%>" class="form-control" name="descripcion" required="true">
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-row">
                                        <div class="col-md-12 d-flex justify-content-center">
                                            <button class="btn btn-success m-1" type="submit">Guardar</button>
                                            <a class="btn btn-danger m-1" href="tipos_solicitudes.jsp">Cancelar</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->
                <jsp:include page="../includes/footer.jsp" flush="true" />
            </div>
            <!-- End of Content Wrapper -->
        </div>
        <!-- End of Page Wrapper -->
        <jsp:include page="../includes/scripts.jsp" flush="true" />
    </body>
</html>
<% }%>
