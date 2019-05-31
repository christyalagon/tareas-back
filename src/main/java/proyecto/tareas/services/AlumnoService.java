package proyecto.tareas.services;

import proyecto.tareas.domain.Alumno;
import proyecto.tareas.models.NuevoAlumno;

import java.util.List;

public interface AlumnoService {
    public Alumno findById(Long id);

    public List<Alumno> findByTutorId(Long id);

    public Alumno save(NuevoAlumno alumno);
}
