package proyecto.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.tareas.models.UsuarioFusion;

import java.util.List;

public interface UsuarioFusionRepository extends JpaRepository<UsuarioFusion, Long> {
    List<UsuarioFusion> findAll();
    List<UsuarioFusion> findByPerfil(char perfil);

}
