package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.*;
import proyecto.tareas.models.ProyectoYTareas;
import proyecto.tareas.models.TareaYAlumnoNombre;
import proyecto.tareas.repositories.*;
import proyecto.tareas.services.ProfesorService;
import proyecto.tareas.services.ProyectoService;

import java.util.ArrayList;
import java.util.List;

@Service("proyectoServiceImp")
public class ProyectoServiceImp implements ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;
    @Autowired
    private TareasRepository tareasRepository;
    @Autowired
    private TieneRepository tieneRepository;
    @Autowired
    private RealizaRepository realizaRepository;
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Proyecto findById(Long id) {
        return proyectoRepository.findById(id);
    }

    @Override
    public Proyecto guardarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public List<Proyecto> buscarPorTutorId(Long tutorId) {
        return proyectoRepository.findByTutorId(tutorId);
    }

    @Override
    public List<ProyectoYTareas> listarProyectosYTareas(Long tutorId) {
        List<Proyecto> proyectos = proyectoRepository.findByTutorId(tutorId);
        List<ProyectoYTareas> tareas = new ArrayList<>();
        for (Proyecto proyecto : proyectos) {
            ProyectoYTareas proyectoYTareas = new ProyectoYTareas();
            proyectoYTareas.setNombreProyecto(proyecto.getNombre());
            proyectoYTareas.setDescripcionProyecto(proyecto.getDescripcion());
            List<Tiene> tienes = tieneRepository.findByNombreProyecto(proyecto.getNombre());
            for (Tiene tiene : tienes) {
                Tareas tarea = tareasRepository.findByCodigoTarea(tiene.getCodigoTarea());
                Realiza realiza = realizaRepository.findByCodigoTarea(tarea.getCodigoTarea());
                Alumno alumno = new Alumno();
                if (realiza != null) {
                    alumno = alumnoRepository.findByCodigoAlumno(realiza.getCodigoAlumno());
                } else {
                    alumno = null;
                    realiza = null;
                }
                TareaYAlumnoNombre tareaYAlumnoNombre = new TareaYAlumnoNombre(tarea, realiza, alumno);
                proyectoYTareas.getTareas().add(tareaYAlumnoNombre);
            }
            tareas.add(proyectoYTareas);
        }

        return tareas;
    }
}
