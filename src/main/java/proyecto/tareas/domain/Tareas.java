package proyecto.tareas.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
//@NamedQuery(
  //      name = "User.findByGroupId",
    //    query =
      //          "SELECT r.codigoAlumno, t.codigoTarea, t.descripcion, r.nota\\n\" +\n" +
        //                "            \"FROM Realiza r inner join Tareas t on r.codigoTarea= t.codigoTarea\\n\" +\n" +
          //              "            \"where r.nota is null"
//)
@Entity
public class Tareas implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "codigo_tarea")
    private String codigoTarea;
    @Column(name = "descripcion")
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoTarea() {
        return codigoTarea;
    }

    public void setCodigoTarea(String codigoTarea) {
        this.codigoTarea = codigoTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
