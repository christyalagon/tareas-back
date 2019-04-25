package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.services.AlumnoService;

@RestController
@RequestMapping("test")
//@CrossOrigin(origins = {"${data-engine-frontal.context-path}"}, maxAge = 3600)
public class TestController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/1")
    public Alumno listAll() {
        return alumnoService.findById(1l);
    }
}
