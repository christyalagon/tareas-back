package proyecto.tareas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.tareas.domain.Alumno;
import proyecto.tareas.domain.Usuario;
import proyecto.tareas.services.AlumnoService;
import proyecto.tareas.services.UsuarioService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/login/{nombre}")
    public Usuario login(@PathVariable String nombre) {
        System.out.println("nombre");
        System.out.println(nombre);
        return usuarioService.login(nombre);
    }

    @RequestMapping("/1")
    public String login2( String nombre) {
        System.out.println("nombre -- " + nombre);
        return "HOLA";
    }
}
// mvn spring-boot:run