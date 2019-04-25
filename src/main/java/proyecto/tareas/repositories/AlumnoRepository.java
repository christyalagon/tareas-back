package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Alumno findById(Long id);
}
