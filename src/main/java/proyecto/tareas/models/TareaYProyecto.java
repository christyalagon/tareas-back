package proyecto.tareas.models;

import lombok.Data;

import javax.persistence.*;

@NamedStoredProcedureQuery(
        name = TareaYProyecto.QUERY_BUSQUEDA_ALUMNOS,
        procedureName = "TareasYProyecto",
        resultClasses = TareaYProyecto.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Long.class)    // idEmpresa
        }
)
@Data
@Entity(name = "Tarea_Proyecto")
public class TareaYProyecto {
    public static final String QUERY_BUSQUEDA_ALUMNOS = "TareasYProyecto";

    @Id
    private Long idTarea;
    private Long idProyecto;
    private String codTarea;
    private String descTarea;
    private String descProyecto;
}
