package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import proyecto.tareas.domain.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, CrudRepository<Usuario, Long> {
    Usuario findById(Long id);

    Usuario findByNombre(String nombre);

    List<Usuario> findByPerfil(char perfil);

    List<Usuario> findAll();

    Usuario save(Usuario usuario);


}
