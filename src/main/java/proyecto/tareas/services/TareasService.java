package proyecto.tareas.services;

import org.springframework.data.jpa.repository.Query;
import proyecto.tareas.domain.Tareas;
import proyecto.tareas.models.TareaYAlumno;

import java.util.List;

public interface TareasService {
    public Tareas findById(Long id);

    public Tareas save(Tareas tarea);

    @Query("SELECT * FROM tareas\n" +
            "where codigoTarea not in(\n" +
            "select codigoTarea from realiza)")
    public List<Tareas> tareasSinAsignar();

    public List<Object> tareasSinNota();

}
