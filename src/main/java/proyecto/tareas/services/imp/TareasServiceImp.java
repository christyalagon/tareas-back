package proyecto.tareas.services.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.tareas.domain.*;
import proyecto.tareas.models.*;
import proyecto.tareas.repositories.*;
import proyecto.tareas.services.TareasService;
import proyecto.tareas.services.UsuarioService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service("tareasServiceImp")
public class TareasServiceImp implements TareasService {
    @Autowired
    private TareasRepository tareasRepository;
    @Autowired
    private RealizaRepository realizaRepository;
    @Autowired
    private AlumnoRepository alumnoRepository;
    @Autowired
    private TieneRepository tieneRepository;
    @Autowired
    private ProyectoRepository proyectoRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Tareas findById(Long id) {
        return tareasRepository.findById(id);
    }

    @Override
    public Tareas save(Tareas tarea) {
        return tareasRepository.save(tarea);
    }

    @Override
    public List<TareaYAlumno> tareasSinAsignar(Long tutorId) {
        List<Tareas> tareas = new ArrayList<>();
        tareas = tareasRepository.tareasSinAsignar();
        List<TareaYAlumno> tareasAMostrar = new ArrayList<>();
        for (Tareas tarea : tareas) {
            Tiene tiene = tieneRepository.findByCodigoTarea(tarea.getCodigoTarea());
            if (tiene != null) {
                Proyecto proyecto = proyectoRepository.findByTutorIdAndNombre(tutorId, tiene.getNombreProyecto());
                if (proyecto != null) {
                    TareaYAlumno tareaYAlumno = new TareaYAlumno(tarea, proyecto.getNombre());
                    tareasAMostrar.add(tareaYAlumno);
                }
            }
        }
        return tareasAMostrar;
    }

    @Override
    public List<TareaYAlumnoNombre> tareasSinNota(Long tutorId) {
        List<Realiza> listadoRealiza = realizaRepository.findByNota(null);
        List<TareaYAlumnoNombre> tareaYAlumnos = new ArrayList<>();
        for (Realiza realiza : listadoRealiza) {
            Alumno alumno = alumnoRepository.findByTutorIdAndCodigoAlumno(tutorId, realiza.getCodigoAlumno());
            if (alumno != null) {
                TareaYAlumnoNombre tareaYAlumno = new TareaYAlumnoNombre();
                Tareas tarea = tareasRepository.findByCodigoTarea(realiza.getCodigoTarea());
                if (tarea != null) {
                    Tiene tiene = tieneRepository.findByCodigoTarea(realiza.getCodigoTarea());
                    if (tiene != null) {
                        tareaYAlumno.setNombreProyecto(tiene.getNombreProyecto());
                    }
                    tareaYAlumno.setIdRealiza(realiza.getId());
                    tareaYAlumno.setDescripcion(tarea.getDescripcion());
                    tareaYAlumno.setCodigoAlumno(realiza.getCodigoAlumno());
                    tareaYAlumno.setNombreAlumno(alumno.getNombre() + ' ' + alumno.getPrimerApellido());
                    tareaYAlumno.setCodigoTarea(realiza.getCodigoTarea());
                    tareaYAlumno.setNota(realiza.getNota());
                    tareaYAlumnos.add(tareaYAlumno);
                }
            }
        }

        return tareaYAlumnos;
    }

    @Override
    public List<ListadoNotas> listadoNotasPorTutorId(Long tutorId) {
        List<Realiza> realizas = realizaRepository.findByNotaNotNullOrderByCodigoAlumnoAscCodigoTarea();
        List<ListadoNotas> listadoNotas = new ArrayList<>();
        System.out.println(tutorId);
        for (Realiza realiza : realizas) {
            Alumno alumno = new Alumno();
            alumno = alumnoRepository.findByCodigoAlumno(realiza.getCodigoAlumno());
            System.out.println(alumno.getTutorId());
            if (alumno.getTutorId() == tutorId) {
                System.out.println("GUALES");
                Tareas tarea = tareasRepository.findByCodigoTarea(realiza.getCodigoTarea());
                ListadoNotas nuevaTarea = new ListadoNotas(alumno.getNombre(), alumno.getPrimerApellido(), alumno.getSegundoApellido(),
                        tarea.getDescripcion(), realiza.getNota());
                listadoNotas.add(nuevaTarea);
            }
        }

        return listadoNotas;
    }

    @Override
    public List<TareaYProyecto> listarPorEmpresa(Long tutorEmpresaId) {
        List<TareaYProyecto> tareas = executeNamedQueryResults(TareaYProyecto.QUERY_BUSQUEDA_ALUMNOS, tutorEmpresaId);
        return tareas;
    }
    @Override
    public List<TareasProfesor> listarPorProfesor(Long idProfesor) {
        List<TareasProfesor> tareas = executeNamedQueryResults(TareasProfesor.QUERY_BUSQUEDA_TAREAS
                , idProfesor);
        return tareas;
    }

    protected <T> List<T> executeNamedQueryResults(final String query, final Long idEmpresa) {
        final StoredProcedureQuery result = createNamedQuery(query, idEmpresa);

        final List<T> respuesta = result.getResultList();
        return respuesta;
    }

    private StoredProcedureQuery createNamedQuery(final String query, final Long idEmpresa) {
        final StoredProcedureQuery result = entityManager.createNamedStoredProcedureQuery(query);
        result.setParameter(1, idEmpresa);

        return result;
    }

}
