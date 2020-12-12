package edu.ufps.pqrsayd.dao.postgres;

import edu.ufps.pqrsayd.dao.ITipoUsuarioDao;
import edu.ufps.pqrsayd.dto.TipoUsuarioDto;
import java.util.List;

public class TipoUsuarioDao extends RepositoryDao<TipoUsuarioDto, Integer> implements ITipoUsuarioDao {

    @Override
    public TipoUsuarioDto guardar(TipoUsuarioDto tipoUsu) {
        return save(tipoUsu);
    }

    @Override
    public TipoUsuarioDto buscarPorId(Integer id) {
        return getById(id);
    }

    @Override
    public List<TipoUsuarioDto> listarTodos() {
        return listAll();
    }

    @Override
    public List<TipoUsuarioDto> listarActivos() {
        String query = String.format("select * from %s where habilitado = ?", getTableName());

        return listDtoByQuery(query, true);
    }

}
