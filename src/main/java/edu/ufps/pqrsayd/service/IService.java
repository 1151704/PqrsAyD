package edu.ufps.pqrsayd.service;

import edu.ufps.pqrsayd.dao.*;

public interface IService {

    public IDepartamentoDao serviceDepartamento();

    public IMunicipioDao serviceMunicipio();

    public IArchivoDao serviceArchivo();

    public IFuncionarioDao serviceFuncionario();

    public IMotivoSolicitudDao serviceMotivoSolicitud();

    public ISolicitudArchivosDao serviceSolicitudArchivos();

    public ISolicitudDao serviceSolicitud();

    public ITipoIdentificacionDao serviceTipoIdentificacion();

    public ITipoSolicitudDao serviceTipoSolicitud();

    public ITipoUsuarioDao serviceTipoUsuario();

    public IUsuarioDao serviceUsuario();

}
