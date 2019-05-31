package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.TutorEmpresa;

import java.util.List;

public interface TutorEmpresaRepository extends JpaRepository<TutorEmpresa, Long>, CrudRepository<TutorEmpresa, Long> {
    TutorEmpresa findById(Long id);

    List<TutorEmpresa> findAll();

    TutorEmpresa save(TutorEmpresa tutorEmpresa);
}
