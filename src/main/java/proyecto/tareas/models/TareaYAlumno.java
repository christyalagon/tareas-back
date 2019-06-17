package proyecto.tareas.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.tareas.domain.Tareas;

@Data
public class TareaYAlumno {
    private Long idTarea;
    private String codigoAlumno;
    private String codigoTarea;
    private String descripcion;
    private Long nota;
    private String nombreProyecto;

    public TareaYAlumno (){

    }
    public TareaYAlumno (Tareas tarea, String nombreProyecto){
        this.idTarea = tarea.getId();
        this.codigoTarea = tarea.getCodigoTarea();
        this.descripcion = tarea.getDescripcion();
        this.nombreProyecto = nombreProyecto;
    }
}
