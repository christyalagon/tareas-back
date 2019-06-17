package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Proyecto;

import java.util.List;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    Proyecto findById(Long id);

    Proyecto save(Proyecto proyecto);

    List<Proyecto> findByTutorId(Long tutorId);
    Proyecto findByTutorIdAndNombre(Long tutorId, String nombre);

}
