package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.domain.ResultadosAprendizaje;

public interface ResultadosAprRepository extends JpaRepository<ResultadosAprendizaje, Long> {
    ResultadosAprendizaje findById(Long id);
}
