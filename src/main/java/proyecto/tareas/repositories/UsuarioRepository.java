package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import proyecto.tareas.domain.Usuario;
import proyecto.tareas.domain.UsuarioFusion;
import proyecto.tareas.models.UsuariosSeparados;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findById(Long id);
    Usuario findByNombre(String nombre);
    List<Usuario> findAll();


}
