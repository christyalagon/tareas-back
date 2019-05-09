package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Realiza;
import proyecto.tareas.domain.Tareas;
import proyecto.tareas.models.TareaYAlumno;
import proyecto.tareas.services.AlumnoService;
import proyecto.tareas.services.RealizaService;
import proyecto.tareas.services.TareasService;

import java.util.List;

@RestController
@RequestMapping("/tareas")
//@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
public class TareasController {
    @Autowired
    private TareasService tareasService;
    @Autowired
    private RealizaService realizaService;
    @PostMapping("/nueva")
    public Tareas tareaSinAlumno(@RequestBody Tareas tarea) {
        return tareasService.save(tarea);
    }
    @PostMapping("/nueva/alumno")
    public Tareas tareaConAlumno(@RequestBody TareaYAlumno tareaAlumno) {
        Tareas nuevaTarea = new Tareas();
        Realiza realiza = new Realiza();
        nuevaTarea.setCodigoTarea(tareaAlumno.getCodigoTarea());
        nuevaTarea.setDescripcion(tareaAlumno.getDescripcion());
        nuevaTarea = tareasService.save(nuevaTarea);
        realiza.setCodigoAlumno(tareaAlumno.getCodigoAlumno());
        realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
        realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
        System.out.println(realizaService.guardarSinNota(realiza));
        realizaService.guardarSinNota(realiza);
        return nuevaTarea;
    }

}