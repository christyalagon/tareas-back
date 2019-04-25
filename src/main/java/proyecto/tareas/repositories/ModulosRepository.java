package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Modulos;

public interface ModulosRepository extends JpaRepository<Modulos, Long> {
    Modulos findById(Long id);
}
