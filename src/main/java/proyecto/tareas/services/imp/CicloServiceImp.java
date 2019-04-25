package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Ciclo;
import proyecto.tareas.repositories.CicloRepository;
import proyecto.tareas.services.CicloService;

@Service("cicloServiceImp")
public class CicloServiceImp implements CicloService {
    @Autowired
    private CicloRepository cicloRepository;

    @Override
    public Ciclo findById(Long id) {
        return cicloRepository.findById(id);
    }
}
