<%@page import="edu.ufps.pqrsayd.dto.*"%>
<%@page import="edu.ufps.pqrsayd.util.Utilidades"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" scope="session" class="edu.ufps.pqrsayd.service.postgres.Service" />
<jsp:include page="../includes/verificarAcceso.jsp" flush="true"/>
<%
    List<TipoSolicitudDto> tiposSolicitudes = controlador.serviceTipoSolicitud().listarTodos();
%>
<!doctype html>
<html lang="es">
    <head>
        <jsp:include page="../includes/head.jsp" flush="true" />
        <title>Tipos de Solicitudes - PQRS</title>
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
                                <h6 class="m-0 font-weight-bold text-primary">Listado de Tipos de Solicitudes</h6>
                            </div>
                            <div class="card-body">

                                <a class="btn btn-success mb-3" title="Registrar" href="registrar_tipo_solicitud.jsp">
                                    <i class="fas fa-plus-circle"></i> Registrar
                                </a>

                                <div class="table-responsive">
                                    <table class="table table-sm table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>Acción</th>
                                                <th>Tipo</th>
                                                <th>Habilitado</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                for (TipoSolicitudDto tipo : tiposSolicitudes) {
                                            %>
                                            <tr>
                                                <td>
                                                    <div class="d-flex justify-content-center align-content-center">
                                                        <a title="Detalle" class="btn btn-sm btn-outline-info m-1" href="actualizar_tipo_solicitud.jsp?id=<%=tipo.getId()%>"  ><i class="fas fa-info-circle"></i></a>
                                                        <a title="Motivos" class="btn btn-sm btn-outline-dark m-1" href="motivos_solicitudes.jsp?id=<%=tipo.getId()%>"  ><i class="fas fa-list"></i></a>
                                                    </div>
                                                </td>
                                                <td><%=tipo.getDescripcion()%></td>
                                                <td><%=tipo.getHabilitado() ? "Si" : "No"%></td>
                                            </tr>
                                            <% }%>
                                        </tbody>
                                    </table>
                                </div>
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

