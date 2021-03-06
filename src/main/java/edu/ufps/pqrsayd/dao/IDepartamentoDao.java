package edu.ufps.pqrsayd.dao;

import edu.ufps.pqrsayd.dto.DepartamentoDto;
import java.util.List;

public interface IDepartamentoDao {

    public List<DepartamentoDto> listarDepartamentos();

    public DepartamentoDto buscarPorId(Integer id);

    public DepartamentoDto buscarPorCodigo(String codigo);

}
