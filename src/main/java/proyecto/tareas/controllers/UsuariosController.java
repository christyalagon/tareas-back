package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.tareas.domain.UsuarioFusion;
import proyecto.tareas.services.UsuarioService;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/listar/profesores")
    public List<UsuarioFusion> listadoProfesores() {
        return usuarioService.profesores();
    }

    @GetMapping("/listar/empresa")
    public List<UsuarioFusion> listadoTutoresEmpresa() {
        return usuarioService.tutoresEmpresa();
    }

    @GetMapping("/listar/todos")
    public List<UsuarioFusion> todos() {
        return usuarioService.listarTodosFusionados();
    }

    @PostMapping("/guardar")
    public UsuarioFusion guardarUsuario(@RequestBody UsuarioFusion usuarioFusion) {
        return usuarioService.guardarUsuario(usuarioFusion);
    }
}