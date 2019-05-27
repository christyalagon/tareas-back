package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.tareas.domain.Alumno;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Alumno findById(Long id);
    Alumno findByCodigoAlumno(String cod);
    List<Alumno> findByTutorId(Long id);
    List<Alumno> findByTutorIdOrderByCodigoAlumno(Long id);
    Alumno findByTutorIdAndCodigoAlumno(Long id, String codigoAlumno);
}
