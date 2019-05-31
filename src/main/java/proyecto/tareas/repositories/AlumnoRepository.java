package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Tareas;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>, CrudRepository<Alumno, Long> {

    Alumno findById(Long id);

    Alumno findByCodigoAlumno(String cod);

    List<Alumno> findByTutorId(Long id);

    List<Alumno> findByTutorIdOrderByCodigoAlumno(Long id);

    Alumno findByTutorIdAndCodigoAlumno(Long id, String codigoAlumno);

    Alumno save(Alumno alumno);
}
