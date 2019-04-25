package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Participa;
import proyecto.tareas.repositories.ParticipaRespository;
import proyecto.tareas.services.ParticipaService;

@Service("participaServiceImp")
public class ParticipaServiceImp implements ParticipaService {
    @Autowired
    private ParticipaRespository participaRespository;

    @Override
    public Participa findById(Long id) {
        return participaRespository.findById(id);
    }
}
