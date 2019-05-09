package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Realiza;

public interface RealizaRepository extends JpaRepository<Realiza, Long> {
    Realiza findById(Long id);
    Realiza save(Realiza realiza);
}
