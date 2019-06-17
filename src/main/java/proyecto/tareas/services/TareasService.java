package proyecto.tareas.services;

import org.springframework.data.jpa.repository.Query;
import proyecto.tareas.domain.Realiza;
import proyecto.tareas.domain.Tareas;
import proyecto.tareas.models.*;

import java.util.List;

public interface TareasService {
    public Tareas findById(Long id);

    public Tareas save(Tareas tarea);

    @Query("SELECT * FROM tareas\n" +
            "where codigoTarea not in(\n" +
            "select codigoTarea from realiza)")
    public List<TareaYAlumno> tareasSinAsignar(Long tutorId);

    public List<TareaYAlumnoNombre> tareasSinNota(Long tutorId);

    public List<ListadoNotas> listadoNotasPorTutorId(Long tutorId);

    public List<TareaYProyecto> listarPorEmpresa(Long tutorEmpresaId);

    public List<TareasProfesor> listarPorProfesor(Long idProfe);


}
