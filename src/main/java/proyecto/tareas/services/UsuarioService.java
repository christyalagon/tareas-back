package proyecto.tareas.services;

import proyecto.tareas.domain.Usuario;
import proyecto.tareas.models.UsuarioFusion;

import java.util.List;

public interface UsuarioService {
    public Usuario findById(Long id);

    public Usuario login(String nombre);

    public List<UsuarioFusion> profesores();

    public List<UsuarioFusion> tutoresEmpresa();

    public List<UsuarioFusion> listarTodosFusionados();

    public UsuarioFusion guardarUsuario(UsuarioFusion usuarioFusion);
}
