package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Ensena;

public interface EnsenaRepository extends JpaRepository<Ensena, Long> {
    Ensena findById(Long id);
}
