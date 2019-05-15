package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Realiza;
import proyecto.tareas.domain.Tareas;
import proyecto.tareas.models.TareaYAlumnoNombre;
import proyecto.tareas.repositories.AlumnoRepository;
import proyecto.tareas.repositories.RealizaRepository;
import proyecto.tareas.repositories.TareasRepository;
import proyecto.tareas.services.TareasService;

import java.util.ArrayList;
import java.util.List;

@Service("tareasServiceImp")
public class TareasServiceImp implements TareasService {
    @Autowired
    private TareasRepository tareasRepository;
    @Autowired
    private RealizaRepository realizaRepository;
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Tareas findById(Long id) {
        return tareasRepository.findById(id);
    }

    @Override
    public Tareas save(Tareas tarea) {
        return tareasRepository.save(tarea);
    }

    @Override
    public List<Tareas> tareasSinAsignar() {
        List<Tareas> tareas = new ArrayList<>();
        tareas = tareasRepository.tareasSinAsignar();
        return tareas;
    }

    @Override
    public List<TareaYAlumnoNombre> tareasSinNota(Long tutorId) {
        List<Realiza> listadoRealiza = realizaRepository.findByNota(null);
        List<TareaYAlumnoNombre> tareaYAlumnos = new ArrayList<>();
        for (Realiza realiza : listadoRealiza) {
            if (alumnoRepository.findByTutorIdAndCodigoAlumno(tutorId, realiza.getCodigoAlumno()) != null) {
                TareaYAlumnoNombre tareaYAlumno = new TareaYAlumnoNombre();
                Alumno alumno = alumnoRepository.findByCodigoAlumno(realiza.getCodigoAlumno());
                Tareas tarea = tareasRepository.findByCodigoTarea(realiza.getCodigoTarea());
                tareaYAlumno.setIdRealiza(realiza.getId());
                tareaYAlumno.setDescripcion(tarea.getDescripcion());
                tareaYAlumno.setCodigoAlumno(realiza.getCodigoAlumno());
                tareaYAlumno.setNombreAlumno(alumno.getNombre() + ' ' + alumno.getPrimerApellido());
                tareaYAlumno.setCodigoTarea(realiza.getCodigoTarea());
                tareaYAlumno.setNota(realiza.getNota());
                tareaYAlumnos.add(tareaYAlumno);
            }
        }

        return tareaYAlumnos;
    }
}
