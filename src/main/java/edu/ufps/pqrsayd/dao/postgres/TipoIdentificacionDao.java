package edu.ufps.pqrsayd.dao.postgres;

import edu.ufps.pqrsayd.dao.ITipoIdentificacionDao;
import edu.ufps.pqrsayd.dto.TipoIdentificacionDto;
import java.util.List;

public class TipoIdentificacionDao extends RepositoryDao<TipoIdentificacionDto, Integer> implements ITipoIdentificacionDao {

    @Override
    public TipoIdentificacionDto guardar(TipoIdentificacionDto tipoId) {
        return save(tipoId);
    }

    @Override
    public TipoIdentificacionDto buscarPorId(Integer id) {
        return getById(id);
    }

    @Override
    public List<TipoIdentificacionDto> listarTodos() {
        return listAll();
    }

}
