package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.tareas.domain.*;
import proyecto.tareas.models.*;
import proyecto.tareas.services.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareasController {
    @Autowired
    private TareasService tareasService;
    @Autowired
    private RealizaService realizaService;
    @Autowired
    private ProyectoService proyectoService;
    @Autowired
    private TieneService tieneService;

    @PostMapping("/nueva")
    public Tareas tareaSinAlumno(@RequestBody TareaYAlumno tareaYAlumno) {
        Tareas tarea = new Tareas(tareaYAlumno);
        tarea = tareasService.save(tarea);
        Tiene tiene = new Tiene(tarea.getCodigoTarea(), tareaYAlumno.getNombreProyecto());
        tieneService.guardar(tiene);
        return tarea;
    }

    @PostMapping("/nueva/alumno")
    public Tareas tareaConAlumno(@RequestBody TareaYAlumno tareaAlumno) {
        Tareas nuevaTarea = new Tareas();
        Realiza realiza = new Realiza();
        nuevaTarea.setCodigoTarea(tareaAlumno.getCodigoTarea());
        nuevaTarea.setDescripcion(tareaAlumno.getDescripcion());
        nuevaTarea = tareasService.save(nuevaTarea);
        Tiene tiene = new Tiene(nuevaTarea.getCodigoTarea(), tareaAlumno.getNombreProyecto());
        tieneService.guardar(tiene);
        realiza.setCodigoAlumno(tareaAlumno.getCodigoAlumno());
        realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
        realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
        realizaService.guardarSinNota(realiza);
        return nuevaTarea;
    }

    @PostMapping("/nueva/alumno/lista")
    public void tareaConAlumnoLista(@RequestBody List<TareaYAlumno> tareasAlumno) {
        for (TareaYAlumno tareaAlumno : tareasAlumno) {
            Realiza realiza = new Realiza();
            realiza.setCodigoAlumno(tareaAlumno.getCodigoAlumno());
            realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
            realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
            realizaService.guardarSinNota(realiza);
        }
    }

    @GetMapping("/listado/asignacion/{tutorId}")
    public List<TareaYAlumno> tareasSinAsginar(@PathVariable Long tutorId) {
        return tareasService.tareasSinAsignar(tutorId);
    }

    @GetMapping("/puntuar/{tutorId}")
    public List<TareaYAlumnoNombre> tareasSinNota(@PathVariable Long tutorId) {
        return tareasService.tareasSinNota(tutorId);
    }

    @PostMapping("/puntuar")
    public void tareasPuntuadas(@RequestBody List<TareaYAlumnoNombre> tareasAlumno) {
        for (TareaYAlumnoNombre tareaAlumno : tareasAlumno) {
            Realiza realiza = new Realiza();
            System.out.println(tareaAlumno.toString());
            realiza.setId(tareaAlumno.getIdRealiza());
            realiza.setCodigoAlumno(tareaAlumno.getCodigoAlumno());
            realiza.setCodigoTarea(tareaAlumno.getCodigoTarea());
            realiza.setNota(tareaAlumno.getNota());
            realiza.setFecha(new Date());
            System.out.println(realiza.toString());
            realizaService.guardarConNota(realiza);
        }
    }

    @GetMapping("/listado/notasPorTutorEmpresa/{tutorId}")
    public List<ListadoNotas> listadoNotasPorTutorId(@PathVariable Long tutorId) {
        return tareasService.listadoNotasPorTutorId(tutorId);
    }

    @GetMapping("/listado/tareasPorEmpresa/{idEmpresa}")
    public List<TareaYProyecto> tareasPorEmpresa(@PathVariable Long idEmpresa) {
        return tareasService.listarPorEmpresa(idEmpresa);
    }

    @PostMapping("/nuevoProyecto")
    public Proyecto nuevoProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.guardarProyecto(proyecto);
    }

    @GetMapping("/listado/tareasPorProfesor/{idProfe}")
    public List<TareasProfesor> tareasPorTutorCentro(@PathVariable Long idProfe) {
        return tareasService.listarPorProfesor(idProfe);
    }
}