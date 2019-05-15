package proyecto.tareas.repositories;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.Tareas;

import java.util.List;

public interface TareasRepository extends JpaRepository<Tareas, Long>, CrudRepository<Tareas, Long> {
    Tareas findById(Long id);
    List<Tareas> findAll();
    Tareas findByCodigoTarea(String codigoTarea);
    Tareas save(Tareas tarea);

    @Query("SELECT t FROM Tareas t \n" +
            "where t.codigoTarea not in(\n" +
            "select r.codigoTarea from Realiza r)")
    public List<Tareas> tareasSinAsignar();

}
