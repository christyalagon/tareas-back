package proyecto.tareas.services;

import proyecto.tareas.domain.Usuario;
import proyecto.tareas.domain.UsuarioFusion;
import proyecto.tareas.models.UsuariosSeparados;

import java.util.List;

public interface UsuarioService {
    public Usuario findById(Long id);
    public Usuario login(String nombre);
}
