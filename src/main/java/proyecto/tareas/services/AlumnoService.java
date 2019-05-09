package proyecto.tareas.services;

import proyecto.tareas.domain.Alumno;

import java.util.List;

public interface AlumnoService {
    public Alumno findById(Long id);

    public List<Alumno> findByTutorId(Long id);
}
