package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.tareas.domain.Proyecto;
import proyecto.tareas.domain.Realiza;
import proyecto.tareas.domain.Tareas;
import proyecto.tareas.models.*;
import proyecto.tareas.services.ProyectoService;
import proyecto.tareas.services.RealizaService;
import proyecto.tareas.services.TareasService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    @Autowired
    private TareasService tareasService;
    @Autowired
    private RealizaService realizaService;
    @Autowired
    private ProyectoService proyectoService;

    @PostMapping("/nuevo")
    public Proyecto nuevoProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.guardarProyecto(proyecto);
    }

    @GetMapping("/listar/tutor/{tutorId}")
    public List<Proyecto> listarPorTutorId(@PathVariable Long tutorId){
        return proyectoService.buscarPorTutorId(tutorId);
    }@GetMapping("/listar/proyecto-tareas/{tutorId}")
    public List<ProyectoYTareas> listarProyectosYTareas(@PathVariable Long tutorId){
        return proyectoService.listarProyectosYTareas(tutorId);
    }
}