package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Puntua;

public interface PuntuaRepository extends JpaRepository<Puntua, Long> {
    Puntua findById(Long id);
}
