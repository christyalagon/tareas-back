package proyecto.tareas.models;

import lombok.Data;

import javax.persistence.*;

@NamedStoredProcedureQuery(
        name = TareasProfesor.QUERY_BUSQUEDA_TAREAS,
        procedureName = "listarTareasPorProfesor",
        resultClasses = TareasProfesor.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class)    // idProfesor
        }
)
@Data
@Entity(name = "tareas_profesor")
public class TareasProfesor {
    public static final String QUERY_BUSQUEDA_TAREAS = "listarTareasPorProfesor";

    @Id
    private Long idTarea;
    private String codTarea;
    private String descTarea;
    private Integer nota;
    private String nombreProyecto;
    private String descProyecto;
    private String nombreAlumno;
    private String apellidoAlumno;
}
