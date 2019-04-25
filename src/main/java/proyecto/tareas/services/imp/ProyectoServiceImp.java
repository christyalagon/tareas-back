package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Profesor;
import proyecto.tareas.domain.Proyecto;
import proyecto.tareas.repositories.ProfesorRepository;
import proyecto.tareas.repositories.ProyectoRepository;
import proyecto.tareas.services.ProfesorService;
import proyecto.tareas.services.ProyectoService;

@Service("proyectoServiceImp")
public class ProyectoServiceImp implements ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public Proyecto findById(Long id) {
        return proyectoRepository.findById(id);
    }
}
