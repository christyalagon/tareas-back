package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.Realiza;

import java.util.List;

public interface RealizaRepository extends CrudRepository<Realiza, Long> {
    Realiza findById(Long id);
    Realiza save(Realiza realiza);
    List<Realiza> findByNota(Long nota);
    Realiza findByCodigoTarea(String codigo);
    List<Realiza> findByNotaNotNullOrderByCodigoAlumnoAscCodigoTarea();
}
