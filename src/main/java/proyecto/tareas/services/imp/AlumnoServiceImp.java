package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Ensena;
import proyecto.tareas.models.NuevoAlumno;
import proyecto.tareas.repositories.AlumnoRepository;
import proyecto.tareas.repositories.EnsenaRepository;
import proyecto.tareas.services.AlumnoService;

import java.util.List;

@Service("alumnoServiceImp")
public class AlumnoServiceImp implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;
    @Autowired
    private EnsenaRepository ensenaRepository;

    @Override
    public Alumno findById(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    public List<Alumno> findByTutorId(Long id) {
        List<Alumno> alumnos = alumnoRepository.findByTutorId(id);
        return alumnos;
    }

    @Override
    public Alumno save(NuevoAlumno nuevoAlumno) {
        Alumno alumno = new Alumno();
        Ensena ensena = new Ensena();

        System.out.println(nuevoAlumno.toString());
        alumno.setNombre(nuevoAlumno.getNombre());
        alumno.setCodigoAlumno(nuevoAlumno.getCodigoAlumno());
        alumno.setPrimerApellido(nuevoAlumno.getPrimerApellido());
        alumno.setSegundoApellido(nuevoAlumno.getSegundoApellido());
        alumno.setTutorId(nuevoAlumno.getTutorId());
        alumno = alumnoRepository.save(alumno);

        ensena.setAlumnoId(alumno.getId());
        ensena.setProfId(nuevoAlumno.getProfesorId());
        ensenaRepository.save(ensena);
        return alumno;
    }
}
