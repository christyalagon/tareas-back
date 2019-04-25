package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Profesor;
import proyecto.tareas.repositories.ProfesorRepository;
import proyecto.tareas.services.ProfesorService;

@Service("profesorServiceImp")
public class ProfesorServiceImp implements ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public Profesor findById(Long id) {
        return profesorRepository.findById(id);
    }
}
