package edu.ufps.pqrsayd.service.postgres;

import edu.ufps.pqrsayd.dao.*;
import edu.ufps.pqrsayd.dao.postgres.*;
import java.io.Serializable;
import edu.ufps.pqrsayd.service.IService;
import edu.ufps.pqrsayd.util.Utilidades;

public class Service implements IService, Serializable {

    private final Utilidades utilidades;

    public Service() {
        this.utilidades = new Utilidades();
    }

    @Override
    public IDepartamentoDao serviceDepartamento() {
        return new DepartamentoDao();
    }

    @Override
    public IMunicipioDao serviceMunicipio() {
        return new MunicipioDao();
    }

    @Override
    public IArchivoDao serviceArchivo() {
        return new ArchivoDao();
    }

    @Override
    public IFuncionarioDao serviceFuncionario() {
        return new FuncionarioDao();
    }

    @Override
    public IMotivoSolicitudDao serviceMotivoSolicitud() {
        return new MotivoSolicitudDao();
    }

    @Override
    public ISolicitudArchivosDao serviceSolicitudArchivos() {
        return new SolicitudArchivosDao();
    }

    @Override
    public ISolicitudDao serviceSolicitud() {
        return new SolicitudDao();
    }

    @Override
    public ITipoIdentificacionDao serviceTipoIdentificacion() {
        return new TipoIdentificacionDao();
    }

    @Override
    public ITipoSolicitudDao serviceTipoSolicitud() {
        return new TipoSolicitudDao();
    }

    @Override
    public ITipoUsuarioDao serviceTipoUsuario() {
        return new TipoUsuarioDao();
    }

    @Override
    public IUsuarioDao serviceUsuario() {
        return new UsuarioDao();
    }

    public Utilidades getUtilidades() {
        return utilidades;
    }

}
