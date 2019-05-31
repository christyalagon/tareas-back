package proyecto.tareas.models;

import lombok.Data;

@Data
public class NuevoAlumno {
    private String codigoAlumno;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Long tutorId;
    private Long profesorId;
}
