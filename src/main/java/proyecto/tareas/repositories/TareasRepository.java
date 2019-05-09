package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.domain.Tareas;

public interface TareasRepository extends JpaRepository<Tareas, Long> {
    Tareas findById(Long id);
    Tareas save(Tareas tarea);
}
