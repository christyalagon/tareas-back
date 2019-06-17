package proyecto.tareas.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Realiza;
import proyecto.tareas.domain.Tareas;

@Data
public class TareaYAlumnoNombre {
    private Long idRealiza;
    private String codigoAlumno;
    private String nombreAlumno;
    private String nombreProyecto;
    private String codigoTarea;
    private String descripcion;
    private Long nota;

    public TareaYAlumnoNombre() {

    }

    public TareaYAlumnoNombre(Tareas tarea, Realiza realiza, Alumno alumno) {
        if (alumno != null) {
            this.codigoAlumno = alumno.getCodigoAlumno();
            this.nombreAlumno = alumno.getNombre() + ' ' + alumno.getPrimerApellido() + ' ' + alumno.getSegundoApellido();
        }
        this.codigoTarea = tarea.getCodigoTarea();
        this.descripcion = tarea.getDescripcion();
        if (realiza != null) {
            this.nota = realiza.getNota();
        }
    }

}
