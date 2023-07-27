package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.request.DelitoDTORequest;
import co.edu.iudigital.helpmeiud.dto.response.DelitoDTO;
import co.edu.iudigital.helpmeiud.exceptions.RestException;

import java.util.List;

public interface IDelitoService {

    /**
     * Consultar todos los delitos
     * @return
     */
    List<DelitoDTO> consultarTodos(); //TODO: throw exception

    /**
     * Consultar delito por su ID
     * @param id
     * @return
     */
    DelitoDTO consultarPorId(Long id);

    /**
     * Guarda un delito
     * @param delitoDTORequest
     * @return
     */
    DelitoDTO guardarDelito(DelitoDTORequest delitoDTORequest) throws RestException;

    /**
     * Borra el delito por su ID
     * @param id
     * @return
     */
    Void borrarDelitoPorId(Long id);
}
