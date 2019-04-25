package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.CriteriosEvaluacion;


public interface CriteriosRepository extends JpaRepository<CriteriosEvaluacion, Long> {
    CriteriosEvaluacion findById(Long id);
}
