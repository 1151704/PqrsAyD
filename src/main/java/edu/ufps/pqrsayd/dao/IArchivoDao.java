package edu.ufps.pqrsayd.dao;

import edu.ufps.pqrsayd.dto.ArchivoDto;

public interface IArchivoDao {

    public ArchivoDto guardar(ArchivoDto archivo);
    
    public ArchivoDto buscarPorId(Integer id);
    
    public boolean eliminarPorId(Integer id);
    
}
