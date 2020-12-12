package edu.ufps.pqrsayd.dao.postgres;

import edu.ufps.pqrsayd.dao.IArchivoDao;
import edu.ufps.pqrsayd.dto.ArchivoDto;

public class ArchivoDao extends RepositoryDao<ArchivoDto, Integer> implements IArchivoDao {

    @Override
    public ArchivoDto guardar(ArchivoDto archivo) {
        return save(archivo);
    }

    @Override
    public ArchivoDto buscarPorId(Integer id) {
        return getById(id);
    }

    @Override
    public boolean eliminarPorId(Integer id) {
        return deleteById(id);
    }

}
