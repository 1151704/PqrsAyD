package edu.ufps.pqrsayd.dao.postgres;

import edu.ufps.pqrsayd.dao.ITipoSolicitudDao;
import edu.ufps.pqrsayd.dto.TipoSolicitudDto;
import java.util.List;

public class TipoSolicitudDao extends RepositoryDao<TipoSolicitudDto, Integer> implements ITipoSolicitudDao {

    @Override
    public TipoSolicitudDto guardar(TipoSolicitudDto tipoSol) {
        return save(tipoSol);
    }

    @Override
    public TipoSolicitudDto buscarPorId(Integer id) {
        return getById(id);
    }

    @Override
    public List<TipoSolicitudDto> listarTodos() {
        return listAll();
    }

    @Override
    public List<TipoSolicitudDto> listarActivos() {
        String query = String.format("select * from %s where habilitado = ?", getTableName());

        return listDtoByQuery(query, true);
    }

}
