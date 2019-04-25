package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.repositories.AlumnoRepository;
import proyecto.tareas.services.AlumnoService;
@Service("alumnoServiceImp")
public class AlumnoServiceImp implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno findById(Long id) {
        return alumnoRepository.findById(id);
    }
}
