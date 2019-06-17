package proyecto.tareas.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.tareas.domain.Tareas;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ProyectoYTareas {
    private String nombreProyecto;
    private String descripcionProyecto;
    private List<TareaYAlumnoNombre> tareas = new ArrayList<>();
}
