package proyecto.tareas.services;

import proyecto.tareas.domain.Usuario;

public interface UsuarioService {
    public Usuario findById(Long id);
    public Usuario login(String nombre);
}
