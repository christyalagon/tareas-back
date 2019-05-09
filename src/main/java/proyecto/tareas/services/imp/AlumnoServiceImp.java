package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.repositories.AlumnoRepository;
import proyecto.tareas.services.AlumnoService;

import java.util.List;

@Service("alumnoServiceImp")
public class AlumnoServiceImp implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno findById(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public List<Alumno> findByTutorId(Long id) {
        List<Alumno> alumnos = alumnoRepository.findByTutorId(id);
        return alumnos;
    }
}
