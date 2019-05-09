package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Usuario;
import proyecto.tareas.services.AlumnoService;
import proyecto.tareas.services.UsuarioService;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
public class AlumnosController {
    @Autowired
    private AlumnoService alumnoService;

    @RequestMapping("/alumnos/tutor/{tutorId}")
    public List<Alumno> listadoAlumnos(@PathVariable String tutorId) {
        return alumnoService.findByTutorId(1l);
    }

}