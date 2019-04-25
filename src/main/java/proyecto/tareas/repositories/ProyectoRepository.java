package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    Proyecto findById(Long id);
}
