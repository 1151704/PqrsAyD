package edu.ufps.pqrsayd.dao;

import edu.ufps.pqrsayd.dto.MunicipioDto;
import java.util.List;

public interface IMunicipioDao {

    public List<MunicipioDto> buscarByIdDepartamento(Integer idDepartamento);

    public MunicipioDto buscarById(Integer id);

}
