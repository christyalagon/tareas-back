package proyecto.tareas.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListadoNotas {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String descripcion;
    private Long nota;
}
