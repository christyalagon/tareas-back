package proyecto.tareas.models;

import lombok.Data;

@Data
public class TareaYAlumno {
    private Long idTarea;
    private String codigoAlumno;
    private String codigoTarea;
    private String descripcion;
}
