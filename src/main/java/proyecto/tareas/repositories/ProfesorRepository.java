package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.Profesor;

import java.util.List;

public interface ProfesorRepository extends JpaRepository<Profesor, Long>, CrudRepository<Profesor, Long> {
    Profesor findById(Long id);

    List<Profesor> findAll();

    Profesor save(Profesor profesor);
}
