package edu.ufps.pqrsayd.dao.postgres;

import edu.ufps.pqrsayd.dao.IMunicipioDao;
import edu.ufps.pqrsayd.dto.MunicipioDto;
import java.util.List;

public class MunicipioDao extends RepositoryDao<MunicipioDto, Integer> implements IMunicipioDao {

    @Override
    public List<MunicipioDto> buscarByIdDepartamento(Integer idDepartamento) {
        String query = String.format("select * from %s where fk_departamento = ? ", getTableName());
        return listDtoByQuery(query, idDepartamento);
    }

    @Override
    public MunicipioDto buscarById(Integer id) {
        return getById(id);
    }

}
