package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Participa;

public interface ParticipaRespository extends JpaRepository<Participa, Long> {
    Participa findById(Long id);
}
