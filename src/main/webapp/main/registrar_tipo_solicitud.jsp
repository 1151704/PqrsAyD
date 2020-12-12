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
<!doctype html>
<html lang="es">
    <head>
        <jsp:include page="../includes/head.jsp" flush="true" />
        <title>Tipo Solicitud Nuevo - PQRS</title>
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

                                <h6 class="m-0 font-weight-bold text-primary"><a class="btn btn-sm btn-outline-dark mr-1" href="tipos_solicitudes.jsp"><i class="fas fa-arrow-circle-left"></i> Volver</a>Registrar Tipo Solicitud</h6>
                            </div>
                            <div class="card-body">
                                <form action="<%=request.getContextPath()%>/registrar-tipo-solicitud" method="post">
                                    <div class="form-group">
                                        <div class="form-row">
                                            <div class="col-lg-7">
                                                <div class="form-group">
                                                    <label>Descripción *</label>
                                                    <input type="text" class="form-control" name="descripcion" required="true">
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
