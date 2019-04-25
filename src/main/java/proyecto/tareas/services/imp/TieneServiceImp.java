package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Tiene;
import proyecto.tareas.repositories.TieneRepository;
import proyecto.tareas.services.TieneService;

@Service("tieneServiceImp")
public class TieneServiceImp implements TieneService {
    @Autowired
    private TieneRepository tieneRepository;

    @Override
    public Tiene findById(Long id) {
        return tieneRepository.findById(id);
    }
}
