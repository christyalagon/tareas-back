package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.UsuarioFusion;
import proyecto.tareas.models.UsuariosSeparados;
import proyecto.tareas.services.AlumnoService;
import proyecto.tareas.services.UsuarioService;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private UsuarioService usuarioService;

}