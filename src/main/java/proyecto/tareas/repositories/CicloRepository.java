package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Ciclo;

public interface CicloRepository extends JpaRepository<Ciclo, Long> {
    Ciclo findById(Long id);
}
