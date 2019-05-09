package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Tareas;
import proyecto.tareas.repositories.TareasRepository;
import proyecto.tareas.services.TareasService;

@Service("tareasServiceImp")
public class TareasServiceImp implements TareasService {
    @Autowired
    private TareasRepository tareasRepository;

    @Override
    public Tareas findById(Long id) {
        return tareasRepository.findById(id);
    }

    @Override
    public Tareas save(Tareas tarea) {
        return tareasRepository.save(tarea);
    }
}
