package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findById(Long id);
    Usuario findByNombre(String nombre);
}
