package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Ensena;

public interface EnsenaRepository extends JpaRepository<Ensena, Long>, CrudRepository<Ensena, Long> {
    Ensena findById(Long id);

    Ensena save(Ensena ensena);
}
