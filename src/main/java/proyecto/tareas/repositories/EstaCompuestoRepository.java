package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.EstaCompuesto;

public interface EstaCompuestoRepository extends JpaRepository<EstaCompuesto, Long> {
    EstaCompuesto findById(Long id);
}
