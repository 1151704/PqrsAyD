package edu.ufps.pqrsayd.dao.postgres;

import edu.ufps.pqrsayd.dao.IMotivoSolicitudDao;
import edu.ufps.pqrsayd.dto.MotivoSolicitudDto;
import java.util.List;

public class MotivoSolicitudDao extends RepositoryDao<MotivoSolicitudDto, Integer> implements IMotivoSolicitudDao {

    @Override
    public List<MotivoSolicitudDto> listarPorTipoSolicitud(Integer fkTipoSolicitud) {

        String query = String.format("select * from %s where fk_tipo_solicitud = ? ", getTableName());

        return listDtoByQuery(query, fkTipoSolicitud);
    }

    @Override
    public MotivoSolicitudDto buscarPorId(Integer id) {
        return getById(id);
    }

    @Override
    public MotivoSolicitudDto guardar(MotivoSolicitudDto motivo) {
        return save(motivo);
    }

}
