package proyecto.tareas.repositories;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import proyecto.tareas.domain.Tareas;

import java.util.List;

public interface TareasRepository extends JpaRepository<Tareas, Long> {
    Tareas findById(Long id);

    Tareas save(Tareas tarea);

    @Query("SELECT t FROM Tareas t \n" +
            "where t.codigoTarea not in(\n" +
            "select r.codigoTarea from Realiza r)")
    public List<Tareas> tareasSinAsignar();

//    @Query("SELECT r.codigoAlumno, t.codigoTarea, t.descripcion, r.nota\n" +
  //          "FROM Realiza r inner join Tareas t on r.codigoTarea= t.codigoTarea\n" +
    //        "where r.nota is null")
    //public List<Object> tareasSinNota();
}
