package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.domain.Tiene;

import java.util.List;

public interface TieneRepository extends JpaRepository<Tiene, Long> {
    Tiene findById(Long id);

    Tiene findByCodigoTarea(String codigo);
    List<Tiene> findByNombreProyecto(String nombre);

    Tiene save(Tiene tiene);
}
