package edu.ufps.pqrsayd.dao;

import edu.ufps.pqrsayd.dto.TipoSolicitudDto;
import java.util.List;

public interface ITipoSolicitudDao {

    public TipoSolicitudDto guardar(TipoSolicitudDto tipoSol);
    
    public TipoSolicitudDto buscarPorId(Integer id);
    
    public List<TipoSolicitudDto> listarTodos();
    
    public List<TipoSolicitudDto> listarActivos();
    
}
