package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.domain.TutorEmpresa;

public interface TutorEmpresaRepository extends JpaRepository<TutorEmpresa, Long> {
    TutorEmpresa findById(Long id);
}
