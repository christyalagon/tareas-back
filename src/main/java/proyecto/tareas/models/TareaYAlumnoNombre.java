package proyecto.tareas.models;

import lombok.Data;

@Data
public class TareaYAlumnoNombre {
    private Long idRealiza;
    private String codigoAlumno;
    private String nombreAlumno;
    private String codigoTarea;
    private String descripcion;
    private Long nota;
}
