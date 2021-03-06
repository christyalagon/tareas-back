package proyecto.tareas.domain;

import lombok.ToString;
import proyecto.tareas.models.TareaYAlumno;
import proyecto.tareas.models.TareaYProyecto;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@ToString
public class Tareas implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "codigo_tarea")
    private String codigoTarea;
    @Column(name = "descripcion")
    private String descripcion;
    public Tareas(){

    }
    public Tareas(TareaYAlumno tareaYAlumno){
        this.id = tareaYAlumno.getIdTarea();
        this.codigoTarea = tareaYAlumno.getCodigoTarea();
        this.descripcion= tareaYAlumno.getDescripcion();
    }

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
