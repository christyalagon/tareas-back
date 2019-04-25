package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.domain.Tiene;

public interface TieneRepository extends JpaRepository<Tiene, Long> {
    Tiene findById(Long id);
}
